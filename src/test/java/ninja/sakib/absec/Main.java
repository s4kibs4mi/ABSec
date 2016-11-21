package ninja.sakib.absec;

import com.eclipsesource.json.JsonObject;
import ninja.sakib.absec.providers.ABSecProvider;
import ninja.sakib.absec.providers.DefaultABSecProvider;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class Main {
    public static void main(String args[]) {
        ABSecProvider provider = new DefaultABSecProvider("Bar");
        ABSecFactory factory = new ABSecFactory(provider);

        ABSecProvider secProvider = new DefaultABSecProvider("Bar");
        ABSecFactory secFactory = new ABSecFactory(secProvider);

        JsonObject params = new JsonObject();
        params.add("name", "Sakib Sami");
        params.add("age", "23");

        System.out.println(factory.encrypt(params.toString()));
        System.out.println(secFactory.decrypt(factory.encrypt(params.toString())));

    }
}
