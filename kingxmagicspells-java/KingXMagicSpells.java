/*
 * SRM537-D1-500
 * SOLVED
 */

public class KingXMagicSpells {

	static final int BITS = 32;

	public double expectedNumber(int[] ducks, int[] spellOne, int[] spellTwo, int K) {
		double[][] bitMeans = new double[ducks.length][BITS];

		for (int i = 0; i < ducks.length; ++i)
			bitMeans[i] = initialBitMeans(ducks[i]);

		double[][] newBitMeans = new double[ducks.length][BITS];

		for (int day = 0; day < K; ++day) {

			for (int i = 0; i < ducks.length; ++i)
				for (int j = 0; j < BITS; ++j)
					if ((spellOne[i] & (1 << j)) == 0)
						newBitMeans[i][j] = bitMeans[i][j];
					else
						newBitMeans[i][j] = 1 - bitMeans[i][j];

			for (int i = 0; i < ducks.length; ++i)
				for (int j = 0; j < BITS; ++j)
					newBitMeans[spellTwo[i]][j] = (newBitMeans[spellTwo[i]][j] + bitMeans[i][j]) * 0.5;

			double[][] c = bitMeans;
			bitMeans = newBitMeans;
			newBitMeans = c;
		}

		return meanFromBits(bitMeans[0]);
	}

	private double meanFromBits(double[] ds) {
		double m = 0;

		for (int i = 0; i < BITS; ++i)
			m += ds[i] * (1 << i);

		return m;
	}

	private double[] initialBitMeans(int ducks) {
		double[] bitMeans = new double[BITS];

		int bit = 0;
		while (ducks > 0) {
			bitMeans[bit] = ducks % 2;
			bit++;
			ducks /= 2;
		}

		return bitMeans;
	}

}
