/*
 * SRM467-D2-500
 * SRM467-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class LateProfessor {

	public double getProbability(int waitTime, int walkTime, int lateTime, int bestArrival, int worstArrival) {
		if (lateTime >= walkTime)
			return 0.0;

		int cycle = waitTime + walkTime;
		int late = walkTime - lateTime;

		bestArrival += cycle - waitTime;
		worstArrival += cycle - waitTime;

		if (worstArrival == bestArrival)
			return (worstArrival % cycle <= late && worstArrival % cycle > 0) ? 1.0 : 0.0;

		int bestCycle = bestArrival / cycle;
		int worstCycle = worstArrival / cycle;

		int sum = 0;

		if (bestCycle == worstCycle) {
			sum = min(late, worstArrival % cycle) - min(late, bestArrival % cycle);
		} else {
			sum = (worstCycle - bestCycle - 1) * late;
			sum += late - min(late, bestArrival % cycle);
			sum += min(late, worstArrival % cycle);
		}

		return sum * 1.0 / (worstArrival - bestArrival);
	}

}
