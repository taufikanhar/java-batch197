package day01;

import java.util.Scanner;

public class StudyCase01Soal01 {

	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Masukan Nomer: ");
		
		int n = Integer.parseInt(input.nextLine());
		
		int number=1;
		
		for (int i = 0; i <n; i++) {
			
			System.out.print(number +"\t");
		
			number=number+2;
		}
		
	}

}
