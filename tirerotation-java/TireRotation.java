/*
 * SRM158-D2-250
 * SOLVED
 */

public class TireRotation {

	public int getCycle(String initial, String current) {
		for (int i = 1; i <= 4; ++i, initial = rotate(initial))
			if (current.equals(initial))
				return i;

		return -1;
	}

	private String rotate(String s) {
		return "" + s.charAt(3) + s.charAt(2) + s.charAt(0) + s.charAt(1);
	}

}
