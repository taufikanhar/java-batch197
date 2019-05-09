package day02;

import java.util.Scanner;

public class StudyCase02Soal02 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int sum, temp = 1;

		System.out.print("Input N1 dan N2: ");

		int N1 = input.nextInt();
		int N2 = input.nextInt();

		int realSum = 0;

		int[] deret = new int[N1];

		for (int k = 0; k < N1; k++) {
			System.out.print(k + "\t");
		}

		for (int i = 1; i <= N1; i++) {
			if (i == 1) {
				System.out.println();
				System.out.print(temp + "\t");
				deret[i - 1] = 1;
				realSum = temp;
			} else if (i % 3 == 0) {
				temp = temp * 3;
				deret[i - 1] = temp;
				System.out.print(temp * -1 + "\t");
			} else {
				temp = temp * 3;
				deret[i - 1] = temp;
				System.out.print(temp + "\t");
			}
		}

		System.out.println();
		for (int j = 1; j <= N2; j++) {
			if (j % 3 == 0) {
				if (j < N2) {
					System.out.print("-" + deret[j - 1] + " *");
					realSum *= deret[j - 1] * -1;
				} else if (j == N2) {
					System.out.print("-" + deret[j - 1]);
					realSum *= deret[j - 1] * -1;
				}
			} else {
				if (j < N2) {
					System.out.print(deret[j - 1] + " * ");
					realSum *= deret[j - 1];
				} else if (j == N2) {
					System.out.print(deret[j - 1]);
					realSum *= deret[j - 1];
				}
			}
		}

		System.out.println(" = " + realSum);

	}

}
