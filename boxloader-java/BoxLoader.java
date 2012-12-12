/*
 * SRM192-D2-250
 * SOLVED
 */

import static java.lang.Math.*;

public class BoxLoader {

	public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
		return max(
				max(place(boxX, boxY, boxZ, itemX, itemY, itemZ), place(boxX, boxY, boxZ, itemX, itemZ, itemY)),
				max(max(place(boxX, boxY, boxZ, itemY, itemX, itemZ), place(boxX, boxY, boxZ, itemY, itemZ, itemX)),
						max(place(boxX, boxY, boxZ, itemZ, itemX, itemY), place(boxX, boxY, boxZ, itemZ, itemY, itemX))));
	}

	private int place(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
		return (boxX / itemX) * (boxY / itemY) * (boxZ / itemZ);
	}

}
