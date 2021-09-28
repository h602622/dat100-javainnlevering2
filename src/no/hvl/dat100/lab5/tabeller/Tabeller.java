package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

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

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

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
