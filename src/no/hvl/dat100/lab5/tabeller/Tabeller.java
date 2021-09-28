package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		if (tabell.length != 0) {
			int i;
			for (i = 0; i < tabell.length - 1; i++) {
				int t = tabell[i];
				System.out.print(t + ",");

			}
			System.out.print(tabell[i]);
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String out = "";

		out += "[";
		if (tabell.length != 0) {
			int i;
			for (i = 0; i < tabell.length - 1; i++) {
				out += tabell[i] + ",";
			}
			out += tabell[i];
		}
		out += "]";
		return out;
	}

	// c)
	public static int summer(int[] tabell) {

		// Vanlig for-løkke
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		sum = 0;
		// Utvidet for-løkke
		for (int i : tabell) {
			sum += i;
		}
		sum = 0;
		// While-løkke
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int number : tabell) {
			if (number == tall)
				return true;
		}

		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] newArr = new int[tabell.length];
		int cnt = tabell.length;

		for (int number : tabell) {
			newArr[--cnt] = number;
		}

		return newArr;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int prev = (int) Double.NEGATIVE_INFINITY;
		for (int number : tabell) {
			if (number < prev) {
				return false;
			}
			prev = number;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int cnt = 0;
		int[] newArr = new int[tabell1.length + tabell2.length];

		for (int number : tabell1) {
			newArr[cnt++] = number;
		}

		for (int number : tabell2) {
			newArr[cnt++] = number;
		}

		return newArr;
	}
}
