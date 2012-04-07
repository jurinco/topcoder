/*
 * TCO12-1A-250
 * SOLVED
 */

import java.util.*;

public class EllysJuice {

	public String[] getWinners(String[] players) {
		BitSet playersMoved = new BitSet(players.length);
		TreeSet<String> winners = new TreeSet<String>();

		getWinners(players, playersMoved, new double[] { 1, 1 }, new HashMap<String, Double>(), winners);

		return winners.toArray(new String[winners.size()]);
	}

	private void getWinners(String[] players, BitSet playersMoved, double[] remains, HashMap<String, Double> drunked, TreeSet<String> winners) {
		if (playersMoved.cardinality() == players.length) {
			String winner = getWinner(drunked);
			if (winner != null)
				winners.add(winner);
		}

		for (int i = 0; i < players.length; ++i)
			if (!playersMoved.get(i)) {
				Double oldDrunked = drunked.get(players[i]);
				double oldRemains = remains[playersMoved.cardinality() % remains.length];

				drunked.put(players[i], (oldDrunked == null ? 0 : oldDrunked) + (remains[playersMoved.cardinality() % remains.length] /= 2));
				playersMoved.set(i);

				getWinners(players, playersMoved, remains, drunked, winners);

				playersMoved.clear(i);
				drunked.put(players[i], oldDrunked);
				remains[playersMoved.cardinality() % remains.length] = oldRemains;
			}
	}

	private String getWinner(HashMap<String, Double> drunked) {
		double max = -1;
		String winner = null;

		for (Map.Entry<String, Double> e : drunked.entrySet())
			if (e.getValue() != null) {
				if (e.getValue() == max) {
					winner = null;
				} else if (e.getValue() > max) {
					winner = e.getKey();
					max = e.getValue();
				}
			}

		return winner;
	}

}
