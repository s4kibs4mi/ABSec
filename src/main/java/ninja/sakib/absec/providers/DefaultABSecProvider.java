package ninja.sakib.absec.providers;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class DefaultABSecProvider implements ABSecProvider {
    private int MATCH_LENGTH = 16;
    private int MATCH_DISTANCE = 2;

    public String encrypt(Map<String, String> params) {
        JsonObject data = new JsonObject();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            data.add(entry.getKey(), entry.getValue());
        }

        long dataLength = data.toString().length();
        String dataAsString = data.toString();
        StringBuilder dataStringBuilder = new StringBuilder();
        for (int i = 0; i < dataLength; i++) {
            if (i % MATCH_DISTANCE == 0) {
                int charIndex = dataAsString.charAt(i);
                dataStringBuilder.append((char) (charIndex + MATCH_LENGTH));
            } else {
                dataStringBuilder.append(dataAsString.charAt(i));
            }
        }
        return dataStringBuilder.toString();
    }

    public Map<String, String> decrypt(String encrypted) {
        long dataLength = encrypted.length();
        StringBuilder dataStringBuilder = new StringBuilder();
        for (int i = 0; i < dataLength; i++) {
            if (i % MATCH_DISTANCE == 0) {
                int charIndex = encrypted.charAt(i);
                dataStringBuilder.append((char) (charIndex - MATCH_LENGTH));
            } else {
                dataStringBuilder.append(encrypted.charAt(i));
            }
        }

        Map<String, String> params = new HashMap<>();
        JsonObject jsonData = Json.parse(dataStringBuilder.toString()).asObject();
        for (String name : jsonData.names()) {
            params.put(name, jsonData.getString(name, ""));
        }

        return params;
    }
}
