package day03;

import java.util.Scanner;

public class StudyCase03Soal01Ulang7 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("N: ");
		int n = input.nextInt();
		// deklarasi array 2 dimensi
		int array[][] = new int[n][n];
		// deklarasi deret
		int deret[] = new int[n];
		// deklarasi nilai awal
		int awal = 1;
		// looping deret
		for (int i = 0; i < deret.length; i++) {
			deret[i] = awal;
			awal = awal + (i + 2);

		}
		// deklarasi deret ke 2
		int deret2[] = new int[n];
		// deklarasi nilai awal ke 2
		int awal2 = 2;
		// looping deret ke 2
		for (int j = 0; j < deret2.length; j++) {
			deret2[j] = awal2;
			awal2 = awal2 + (2 * (j + 1));

		}
		for (int i = 0; i < deret2.length; i++) {
			for (int j = 0; j < deret2.length; j++) {
				// rumus diagonal kiri atas ke kanan bawah
				if (i == j)
					array[i][j] = deret[i];
				// rumus diagonal kiri bawah ke kanan atas
				else if (i + j == n - 1)
					array[i][j] = deret2[j];
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
