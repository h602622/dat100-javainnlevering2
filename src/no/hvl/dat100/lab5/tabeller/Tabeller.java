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

		throw new UnsupportedOperationException("reverser ikke implementert");

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

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
