/*
 * TCO11-1C-500
 * SOLVED
 */

import java.util.*;
import static java.lang.Math.*;

public class CoinMachinesGame {

	public int maxGames(int coins, int[] need, int[] give) {
		TreeMap<Integer,Integer> costs = new TreeMap<Integer,Integer>();
		
		for (int i = 0; i < need.length; ++ i) {
			int cost = need[i] - give[i];
			
			if (costs.containsKey(cost)) {
				costs.put(cost, min(need[i], costs.get(cost)));
			} else {
				costs.put(cost, need[i]);
			}
		}
		
		int count = 0;
		for (Map.Entry<Integer, Integer> e : costs.entrySet()) {
			if (coins < e.getValue())
				continue;
			
			int c = (coins - e.getValue()) / e.getKey() + 1;
			count += c;
			coins -= c * e.getKey();
		}
		
		return count;
	}

}
