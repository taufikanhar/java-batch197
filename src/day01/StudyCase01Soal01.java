package day01;

import java.util.Scanner;

public class StudyCase01Soal01 {

	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Masukan Jumlah Deret: ");
		
		int n = input.nextInt();
		
		int number=1;
		
		for (int i = 0; i <9; i++) {
			//rumus perulangan
			
			System.out.print(number +"\t");
			//print perulangan
			number=number+2;
			
		}
		
	}

}
