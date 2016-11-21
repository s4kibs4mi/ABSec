package ninja.sakib.absec.providers;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public interface ABSecProvider {
    String encrypt(String plainData);

    String decrypt(String encrypted);
}
