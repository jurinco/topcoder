/*
 * TCO12-1C-250
 * SOLVED
 */

public class PasswordXGuessing {

	public long howMany(String[] guesses) {
		long count = 0;
		String first = guesses[0];

		for (int i = 0; i < first.length(); ++i)
			for (char c = '0'; c <= '9'; ++c)
				if (valid(first.substring(0, i) + c + first.substring(i + 1), guesses))
					count++;

		return count;
	}

	private boolean valid(String password, String[] guesses) {
		for (String guess : guesses)
			if (!valid(password, guess))
				return false;

		return true;
	}

	private boolean valid(String password, String guess) {
		int diff = 0;

		for (int i = 0; i < password.length(); ++i)
			if (password.charAt(i) != guess.charAt(i))
				diff++;

		return diff == 1;
	}

}
