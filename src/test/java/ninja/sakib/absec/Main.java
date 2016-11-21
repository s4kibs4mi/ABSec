package ninja.sakib.absec;

import ninja.sakib.absec.providers.ABSecProvider;
import ninja.sakib.absec.providers.DefaultABSecProvider;

import java.util.HashMap;
import java.util.Map;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class Main {
    public static void main(String args[]) {
        ABSecProvider provider = new DefaultABSecProvider();
        ABSecFactory factory = new ABSecFactory(provider);
        Map<String, String> params = new HashMap<>();
        params.put("name", "Sakib Sami");
        params.put("age", "23");
        params.put("location", "dhaka");

        System.out.println(factory.encrypt(params));
        System.out.println(factory.decrypt(factory.encrypt(params)));

    }
}
