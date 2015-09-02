package at.bradatsch.android.olivia;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class StrongAES {

	private String value = null;
	private String value_crypt = null;
	private String value_decrypt = null;
	Boolean crypt = true;

	public String getValuecrypt() {
		return value_crypt;
	}

	public String getValuedecrypt() {
		return value_decrypt;
	}

	public String run(String value, Boolean crypt) {
		try {
			this.value = value;
			String key = "Bar12345Bar12345"; // 128 bit key

			// Create key and cipher
			Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");

			// encrypt the text
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(this.value.getBytes());
			value_crypt = (new String(encrypted));

			// decrypt the text
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			value_decrypt = new String(cipher.doFinal(encrypted));

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (crypt == true)
			return value_crypt;
		else
			return value_decrypt;
	}

}

