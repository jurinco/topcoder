/*
 * SRM147-D2-250
 * SOLVED
 */

public class CCipher {

	public String decode(String cipherText, int shift) {
		char[] chars = cipherText.toCharArray();
		int size = 'Z' + 1 - 'A';

		for (int i = 0; i < chars.length; i++)
			chars[i] = (char) (((chars[i] - 'A') - shift + size) % size + 'A');

		return new String(chars);
	}

}
