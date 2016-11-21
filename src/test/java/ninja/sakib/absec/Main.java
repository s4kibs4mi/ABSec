package ninja.sakib.absec;

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
        ABSecProvider provider = new DefaultABSecProvider("SampleEncryptionKey");
        ABSecFactory factory = new ABSecFactory(provider);

        ABSecProvider secProvider = new DefaultABSecProvider("SampleEncryptionKey");
        ABSecFactory secFactory = new ABSecFactory(secProvider);

        System.out.println(factory.encrypt("Hello-World"));
        System.out.println(secFactory.decrypt(factory.encrypt("Hello-World")));
    }
}
