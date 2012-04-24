/*
 * SRM520-D2-250
 * SOLVED
 */
import java.util.*;

public class SRMRoomAssignmentPhase {

	public int countCompetitors(int[] ratings, int K) {
		int my = ratings[0];

		Arrays.sort(ratings);

		int pos = Arrays.binarySearch(ratings, my);

		return (ratings.length - 1 - pos) / K;
	}

}
