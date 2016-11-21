package ninja.sakib.absec.core;

import ninja.sakib.absec.providers.ABSecProvider;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class ABSecFactory {
    private ABSecProvider secProvider;

    public ABSecFactory(ABSecProvider secProvider) {
        this.secProvider = secProvider;
    }

    public String encrypt(String plainData) {
        return secProvider.encrypt(plainData);
    }

    public String decrypt(String encrypted) {
        return secProvider.decrypt(encrypted);
    }
}
