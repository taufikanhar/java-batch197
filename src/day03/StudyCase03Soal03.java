package day03;

import java.util.Scanner;

public class StudyCase03Soal03 {
	
	public static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = input.nextInt();
		System.out.println("M: ");
		int m = input.nextInt();
		System.out.println("O: ");
		int o = input.nextInt();
		
		int[][] array = new int [n][n];
		
		int[] arr = deretTiga(n*4, m, o);
		//panggil method
		int index = 0;
		for (int i = 0; i < n; i++) {
			array[0][i]= arr[index];
			index++;
		// bikin horizon atas
			
		}
		for (int i = 1; i < n; i++) {
			array[i][n-1]= arr[index];
			index++;
		// bikin baris vertikal kanan
			
		}
		
		for (int i = n-2; i >= 0; i--) {
			array[n-1][i]=arr[index];
			index++;
		//horizon bawah
		}
		for (int i = n-2 ; i >=1; i--) {
			array[i][0]=arr[index];
			index++;
		//vertikal kiri, "i>=1 & i--" hitung n dari kanan
		}
		
		// cetak array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
	
	static int [] deretTiga(int n, int m, int o) {
		//method baru
		int array [] = new int [n];
		//array baru
		int angka = o;
		//o = nilai awal
		for (int i = 0; i < n; i++) {
			
			if(i % (m+1) == m) {
				// i mod 
				array[i]=m;
			}else {
				array[i]=angka;
				angka +=m;
			}
		}
		return array;
		
		
	}

}
