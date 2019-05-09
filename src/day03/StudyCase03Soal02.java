package day03;

import java.util.Scanner;

public class StudyCase03Soal02 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Input N: ");
		int n = input.nextInt();
		System.out.println("Input M: ");
		int m = input.nextInt();
		System.out.println("Input O:");
		int o = input.nextInt();
		// membuat inpuntan M,N,O

		int array[][] = new int[n][n];
		// deklarasi aray 2 dimensi
		int deret[] = new int[n];
		// deklarasi aray pertama
		int awal = 2;
		// nilai awal
		for (int i = 0; i < deret.length; i++) {
			deret[i] = awal;
			awal = awal + (i + m);
		}
		/*
		for (int i = 0; i < deret.length; i++) {
				if (i==i)
					deret[]=deret[i];
			} 
				System.out.println(array[i]+"\t");
			*/}
			
			
		}
	


