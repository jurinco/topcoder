/*
 * SRM152-D2-1000
 * SOLVED
 */

public class ProblemWriting {

	enum State {
		NUM, DOTS_NO, DOTS_NOC, DOTS_ON, DOTS_ONC, OP
	};

	public String myCheckData(String dotForm) {
		if (dotForm.length() < 1 || dotForm.length() > 25)
			return "dotForm must contain between 1 and 25 characters, inclusive.";

		State s = State.NUM;
		int i = 0;
		while (i < dotForm.length()) {
			char c = dotForm.charAt(i);

			switch (s) {
			case NUM:
				if (c >= '0' && c <= '9') {
					s = State.DOTS_NO;
					i++;
				} else {
					return "dotForm is not in dot notation, check character " + i + ".";
				}
				break;
			case OP:
				if (c == '+' || c == '-' || c == '*' || c == '/') {
					s = State.DOTS_ON;
					i++;
				} else {
					return "dotForm is not in dot notation, check character " + i + ".";
				}
				break;
			case DOTS_NO:
			case DOTS_NOC:
				if (c == '.') {
					s = State.DOTS_NOC;
					i++;
				} else {
					s = State.OP;
				}
				break;
			case DOTS_ON:
			case DOTS_ONC:
				if (c == '.') {
					s = State.DOTS_ONC;
					i++;
				} else {
					s = State.NUM;
				}
				break;
			}
		}

		if (s == State.DOTS_NO)
			return "";
		else
			return "dotForm is not in dot notation, check character " + i + ".";
	}

}
