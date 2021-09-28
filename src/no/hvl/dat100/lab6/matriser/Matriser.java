package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] i : matrise) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String out = "";
		for (int[] i : matrise) {
			for (int j : i) {
				out += j + " ";
			}
			out += "\n";
		}
		return out;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] mat = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				mat[i][j] = matrise[i][j] * tall;
			}
		}
		return mat;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int aRows = a.length;
		int bCols = b[0].length;

		if (aRows != bCols) {
			System.out.println("Ikke like mange rader i a som kolonner i b");
			return null;
		}

		int[][] crossProduct = new int[aRows][bCols];

		for (int i = 0; i < aRows * bCols; i++) {
			int rIdx = i / aRows;
			int cIdx = i % bCols;
			int prod = 0;
			int[] aRow = a[rIdx];

			int j = 0;
			for (int[] bRow : b) {
				prod += aRow[j] * bRow[cIdx];
				j++;
			}
			crossProduct[rIdx][cIdx] = prod;
		}

		return crossProduct;
	}
}
