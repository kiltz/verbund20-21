package de.verbund.pwmanager.utils;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Base64;

public class AESCrypter {

    Cipher ecipher;
    Cipher dcipher;

    byte[] iv = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};

    public AESCrypter(String password) {
        try {

            Base64.Decoder b64 = Base64.getDecoder();
            byte[] cipherText = b64.decode(password);
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.reset();
            messagedigest.update(cipherText);
            Arrays.fill(cipherText, (byte) 0);

            SecretKeySpec skeySpec = new SecretKeySpec(messagedigest.digest(), "AES");

            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);

            ecipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            dcipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            ecipher.init(Cipher.ENCRYPT_MODE, skeySpec, paramSpec);
            dcipher.init(Cipher.DECRYPT_MODE, skeySpec, paramSpec);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public String verschluessele(String str) {
        try {
            byte[] utf8 = str.getBytes("UTF8");
            byte[] enc = ecipher.doFinal(utf8);
            str = Base64.getEncoder().encodeToString(enc);
            str = str.replace("\n", "");
            str = str.replace("\r", "");
        } catch (Exception e) {
            System.err.println(e);
        }
        return str;
    }

    public String entschluessele(String str) throws Exception {
        byte[] dec = Base64.getDecoder().decode(str);
        byte[] utf8 = dcipher.doFinal(dec);
        return new String(utf8, "UTF8");
    }

    public static void main(String[] args) throws Exception {
        AESCrypter aesCrypter = new AESCrypter("unheimlichGeheim");

        String str = "meine ganz geheime Nachricht";
        str = aesCrypter.verschluessele(str);
        System.out.println("en: " + str);
        System.out.println("de: " + aesCrypter.entschluessele(str));

    }

}