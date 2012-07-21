/*
 * SRM154-D2-450
 * SOLVED
 */

public class SuperRot {

	public String decoder(String message) {
		char[] enc = message.toCharArray();
		char[] dec = new char[message.length()];

		for (int i = 0; i < enc.length; ++i)
			dec[i] = decodeChar(enc[i]);

		return new String(dec);
	}

	private char decodeChar(char c) {
		if (c >= 'A' && c <= 'M')
			return (char) (c + ('N' - 'A'));
		else if (c >= 'N' && c <= 'Z')
			return (char) (c + ('A' - 'N'));
		else if (c >= 'a' && c <= 'm')
			return (char) (c + ('n' - 'a'));
		else if (c >= 'n' && c <= 'z')
			return (char) (c + ('a' - 'n'));
		else if (c >= '0' && c <= '4')
			return (char) (c + 5);
		else if (c >= '5' && c <= '9')
			return (char) (c - 5);

		return c;
	}

}
