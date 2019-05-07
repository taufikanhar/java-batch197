package day02;

import java.util.Scanner;

public class StudyCase02Soal03 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		
		System.out.println("Masukan Nilai N1");
		int n1 = input.nextInt();
		// input panjang deret
		System.out.println("Masukan Nilai N2");
		int n2 = input.nextInt();
		// input nilai awal
		System.out.println("Masukan Nilai N3");
		int n3 = input.nextInt();
		// input perkalian
		
		int [] deret = new int [n1];
		// array baru, n1 panjang array
		int awal = n2;
		//nilai awal
		int tengah = n1 / 2;
		// menentukan nilai tengah
		for (int i=0; i<n1; i++) {
			deret[i] = awal;
			if (i < n1 / 2) {
				awal = awal * n3;
				// jika i lebih kecil dari nilai tengah
		} else {
				awal = awal / n3;
				// jika i lebih besar dari nilai tengah
		}
		
			System.out.print(deret[i] + "\t");
			
		}
		System.out.println();
		//bikin enter baru
		System.out.print("Perhitungan = " + deret [tengah]);
		// print deret dari nilai tengah "24"
		int hasil = deret [tengah];
		// deklarasi hasil
		for (int i= tengah +1 ; i < tengah + 3; i++) {
			// +1 supaya 24 tidak di print lagi, +3 batas akhir yang di butuhkan
			hasil = hasil - deret[i];
			//perhitugan hasil
			System.out.print("-" + deret[i]);
		}
	System.out.print("= " + hasil);
	}

}
