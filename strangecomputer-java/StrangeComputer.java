/*
 * SRM450-D2-250
 * SOLVED
 */

public class StrangeComputer {

	public int setMemory(String mem) {
		int i = 0;
		int o = 0;

		while (i < mem.length() && mem.charAt(i) == '0')
			i++;

		int c = 1;
		while (i < mem.length()) {
			o++;

			while (i < mem.length() && mem.charAt(i) == c + '0')
				i++;

			c = 1 - c;
		}

		return o;
	}

}
