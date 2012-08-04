/*
 * SRM521-D2-500
 * SOLVED
 */

public class MissingParentheses {

	public int countCorrections(String par) {
		int deep = 0;
		int ins = 0;

		for (char c : par.toCharArray()) {
			if (c == '(')
				deep++;
			else if (deep > 0)
				deep--;
			else
				ins++;
		}

		return ins + deep;
	}

}
