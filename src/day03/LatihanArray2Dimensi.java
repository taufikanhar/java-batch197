package day03;

import java.util.Scanner;

public class LatihanArray2Dimensi {

	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("N");
		int n = Integer.parseInt(input.nextLine());
		
		//deklarasi aray 2 dimensi
		int array [][] = new int [n][n];
		//buat deret pertama
		int deret[] = new int [n];
		//nilai awal dari deret
		int awal = 1;
		//rumus perulangan
		for (int i = 0; i < deret.length; i++) {
			deret [i]=awal;
			awal = awal +  (i+2);
		}
		
		int deret2 [] = new int [n];
		int awal2 = 2;
		for (int j = 0; j < deret.length; j++) {
			deret2 [j] = awal2;
			awal2 = awal2 + (2*(j+1));
		}
		
		for (int i = 0; i < deret2.length; i++) {
			for (int j = 0; j < deret2.length; j++) {
				if (i==j)
					array[i][j]=deret[i];
				else if (i+j==n-1)
					array[i][j]=deret2[j];
				System.out.print(array[i][j]+"\t");
			
			}
			System.out.println();
		}
			
		}
		
		
			
			

	}

