/*
 * SRM538-D1-450
 * SOLVED
 */

import java.util.*;

import static java.lang.Math.*;

public class TurtleSpy {

	public double maxDistance(String[] commands) {
		double sumForward = 0;
		double sumBackward = 0;

		ArrayList<Integer> rots = new ArrayList<Integer>();

		for (String cmd : commands) {
			String[] parts = cmd.split(" ");

			if (parts[0].equals("forward")) {
				sumForward += Integer.valueOf(parts[1]);
			} else if (parts[0].equals("backward")) {
				sumBackward += Integer.valueOf(parts[1]);
			} else if (parts[0].equals("left")) {
				rots.add(Integer.valueOf(parts[1]));
			} else if (parts[0].equals("right")) {
				rots.add(-Integer.valueOf(parts[1]));
			} else {
				throw new RuntimeException();
			}
		}

		if (sumForward == 0)
			return sumBackward;

		if (sumBackward == 0)
			return sumForward;

		int bestAngle = findAngle(rots);

		return sqrt(sumForward * sumForward + sumBackward * sumBackward + 2 * sumForward * sumBackward * cos(bestAngle * PI / 180));
	}

	private int findAngle(ArrayList<Integer> rots) {
		HashSet<Integer> angles = new HashSet<Integer>();

		angles.add(180);

		for (int rot : rots) {
			@SuppressWarnings("unchecked")
			HashSet<Integer> newAngles = (HashSet<Integer>) angles.clone();

			for (int angle : angles) {
				newAngles.add((angle + rot + 360) % 360);
			}

			angles = newAngles;
		}

		TreeSet<Integer> res = new TreeSet<Integer>();
		for (int angle : angles)
			res.add(angle > 180 ? 360 - angle : angle);

		return res.first();
	}

}
