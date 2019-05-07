package day03;

import java.util.Scanner;

public class StudyCase03Soal01 {

	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("N");
		int n = Integer.parseInt(input.nextLine());
		int array [][] = new int [n][n];
		//deklarasi aray 2 dimensi
		int deret [] = new int [n];
		//buat deret pertama
		int awal = 1;
		//nilai awal dari deret
		for (int i = 0; i < deret.length; i++) {
			deret [i]= awal;
			awal = awal +(i+2);
			
		
		}
	
		int []deret2= new int [n];
		int awal2 = 2;
		for (int j = 0; j < deret2.length; j++) {
			deret2[j] = awal2;
			awal2 = awal2 + (2*(j+1));
			
		}
		for (int i = 0; i < deret2.length; i++) {
			for (int j = 0; j < deret2.length; j++) {
				if (i==j)
					//diagonal atas kiri kanan bawah
					array[i][j]=deret[i];
				else if (i+j==n-1)
					//diagonal bawah kanan atas kiri
			
					array[i][j] = deret2[j];
				
			System.out.print(array[i][j]+"\t");
				}
			System.out.println();
		}
		
				
			}
				
			
		}


