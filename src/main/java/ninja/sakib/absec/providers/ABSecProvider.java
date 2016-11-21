package ninja.sakib.absec.providers;

import java.util.Map;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public interface ABSecProvider {
    String encrypt(Map<String, String> params);

    Map<String, String> decrypt(String encrypted);
}
