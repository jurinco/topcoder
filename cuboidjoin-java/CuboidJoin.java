/*
 * SRM191-D2-1000
 * SOLVED
 */

import java.util.*;

public class CuboidJoin {

	static int N = -20000;

	public long totalVolume(int[] cuboids) {
		TreeSet<Integer> xs = new TreeSet<Integer>();
		TreeSet<Integer> ys = new TreeSet<Integer>();
		TreeSet<Integer> zs = new TreeSet<Integer>();

		for (int i = 0; i < cuboids.length; i += 6) {
			xs.add(cuboids[i]);
			ys.add(cuboids[i + 1]);
			zs.add(cuboids[i + 2]);

			xs.add(cuboids[i + 3]);
			ys.add(cuboids[i + 4]);
			zs.add(cuboids[i + 5]);
		}

		if (xs.size() < 2 || ys.size() < 2 || zs.size() < 2)
			return 0;

		long volume = 0;

		int px = N;
		for (int x : xs) {
			if (px > N) {
				int py = N;

				for (int y : ys) {
					if (py > N) {
						int pz = N;

						for (int z : zs) {
							if (pz > N) {
								int cx = x + px;
								int cy = y + py;
								int cz = z + pz;

								if (inside(cx, cy, cz, cuboids, 2))
									volume += ((long) x - px) * ((long) y - py) * ((long) z - pz);
							}

							pz = z;
						}
					}

					py = y;
				}
			}

			px = x;
		}

		return volume;
	}

	private boolean inside(int cx, int cy, int cz, int[] cuboids, int m) {
		for (int i = 0; i < cuboids.length; i += 6)
			if (cx > cuboids[i] * m && cy > cuboids[i + 1] * m && cz > cuboids[i + 2] * m && cx < cuboids[i + 3] * m && cy < cuboids[i + 4] * m && cz < cuboids[i + 5] * m)
				return true;

		return false;
	}

}
