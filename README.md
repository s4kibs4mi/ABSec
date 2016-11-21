# ABSec [ APIBetterSecurity ]
ABSec is a library to provide double layer protection by encrypting data on network communication.


```
ABSecProvider provider = new DefaultABSecProvider("SampleEncryptionKey");  // AES Encryption
ABSecFactory factory = new ABSecFactory(provider);

JsonObject params = new JsonObject();
params.add("name", "Sakib Sami");
params.add("age", "23");

String encrypted = factory.encrypt(params.toString());   // z5avyckvjkPTnfdNbRQ2QEMU9iYmpIupaQ5kEcikYwTWZsnAbPrToAMWHClKrq6+
factory.decrypt(encrypted);  // {"name":"Sakib Sami","age":"23"}
```

If you want to write your own encryption provider,

```
public class CustomProvider implements ABSecProvider {
    public String encrypt(String plainData) {
        // Write by yourself
        return "";
    }

    public String decrypt(String encrypted) {
        // Write by yourself
        return "";
    }
}
```
