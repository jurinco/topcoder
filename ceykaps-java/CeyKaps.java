/*
 * SRM148-D2-600
 * UNSOLVED
 */

public class CeyKaps {

	class Switch {
		public final char a, b;

		public Switch(String s) {
			String[] parts = s.split(":");
			a = parts[0].charAt(0);
			b = parts[1].charAt(0);
		}
	}

	public String decipher(String typed, String[] switches) {
		Switch[] sw = new Switch[switches.length];

		for (int i = 0; i < switches.length; i++)
			sw[i] = new Switch(switches[i]);

		char[] chars = typed.toCharArray();
		for (int i = 0; i < chars.length; i++)
			for (Switch s : sw)
				if (s.a == chars[i])
					chars[i] = s.b;
				else if (s.b == chars[i])
					chars[i] = s.a;

		return new String(chars);
	}

}
