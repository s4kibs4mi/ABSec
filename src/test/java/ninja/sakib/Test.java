package ninja.sakib;

import ninja.sakib.absec.core.ABSecFactory;
import ninja.sakib.absec.providers.ABSecProvider;
import ninja.sakib.absec.providers.DefaultABSecProvider;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class Test {
    public static void main(String args[]) {
        ABSecProvider provider = new DefaultABSecProvider("123456");
        ABSecFactory factory = new ABSecFactory(provider);

        System.out.println(factory.encrypt("HelloWorld"));
        System.out.println(factory.decrypt(factory.encrypt("HelloWorld")));
    }
}
