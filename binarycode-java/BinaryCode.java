public class BinaryCode {

	public String[] decode(String message) {
		return new String[] { decodeWithFirst(message, '0'), decodeWithFirst(message, '1') };
	}

	private String decodeWithFirst(String message, char first) {
		char a = first;
		char b = decode(message.charAt(0), '0', a);

		if (message.length() == 1) {
			if (b == '0')
				return a + "";
			else
				return "NONE";
		}

		if (!valid(a) || !valid(b))
			return "NONE";

		StringBuilder res = new StringBuilder();
		res.append(a);
		res.append(b);
		for (int i = 1; i < message.length() - 1; ++i) {
			char c = decode(message.charAt(i), a, b);

			if (!valid(c))
				return "NONE";

			res.append(c);
			a = b;
			b = c;
		}

		if (decode(message.charAt(message.length() - 1), a, b) != '0')
			return "NONE";

		return res.toString();
	}

	private char decode(char s, char a, char b) {
		return (char) ((s - '0') - (a - '0') - (b - '0') + '0');
	}

	private boolean valid(char c) {
		return c >= '0' && c <= '1';
	}

}
