package ninja.sakib.absec.security;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * := Coded with love by Sakib Sami on 11/21/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class AESAlgorithm {
    private String secretKeyPlain;
    private Cipher cipherEncrypt;
    private Cipher cipherDecrypt;

    public AESAlgorithm(String secretKeyPlain) {
        this.secretKeyPlain = secretKeyPlain;

        init();
    }

    private void init() {
        try {
            cipherEncrypt = Cipher.getInstance("AES");
            cipherDecrypt = Cipher.getInstance("AES");

            SecretKey secretKey = new SecretKeySpec(Arrays.copyOf(secretKeyPlain.getBytes("UTF-8"), 16), "AES");

            cipherEncrypt.init(Cipher.ENCRYPT_MODE, secretKey);
            cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKey);
        } catch (UnsupportedEncodingException | NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String plainText) throws BadPaddingException, IllegalBlockSizeException {
        return Base64.encodeBase64String(cipherEncrypt.doFinal(plainText.getBytes()));
    }

    public String decrypt(String encrypted) throws BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        return new String(cipherDecrypt.doFinal(Base64.decodeBase64(encrypted.getBytes())));
    }
}
