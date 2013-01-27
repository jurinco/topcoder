import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int c = 0; c < 10; ++c) {
			int[] ar = new int[20];

			for (int i = 0; i < ar.length; ++i) {
				ar[i] = rand.nextInt() % 10000;
			}

			synsort(ar);

			for (int i = 0; i < ar.length; ++i)
				System.out.print(ar[i] + " ");
			System.out.println();
		}
	}

	private static void arswap(int[] arr, int a, int b) {
		int v = arr[a];
		arr[a] = arr[b];
		arr[b] = v;
	}

	private static void synsort(int[] a1) {
		for (int i = 0; i < a1.length; ++i)
			for (int j = 1; j < a1.length; ++j)
				if (a1[j] < a1[j - 1]) {
					arswap(a1, j - 1, j);
				}
	}
}
