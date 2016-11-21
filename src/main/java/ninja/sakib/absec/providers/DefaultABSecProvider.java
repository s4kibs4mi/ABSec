package ninja.sakib.absec.providers;

import ninja.sakib.absec.security.AESAlgorithm;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.io.UnsupportedEncodingException;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class DefaultABSecProvider implements ABSecProvider {
    private AESAlgorithm aesAlgorithm;

    public DefaultABSecProvider(String secretKey) {
        aesAlgorithm = new AESAlgorithm(secretKey);
    }

    public String encrypt(String plainData) {
        try {
            return aesAlgorithm.encrypt(plainData);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decrypt(String encrypted) {
        try {
            return aesAlgorithm.decrypt(encrypted);
        } catch (BadPaddingException | IllegalBlockSizeException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
