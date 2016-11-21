package ninja.sakib.absec;

import ninja.sakib.absec.providers.ABSecProvider;

import java.util.Map;

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

    public String encrypt(Map<String, String> params) {
        return secProvider.encrypt(params);
    }

    public Map<String, String> decrypt(String encrypted) {
        return secProvider.decrypt(encrypted);
    }
}