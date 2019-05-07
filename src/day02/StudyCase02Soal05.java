package day02;

import java.util.Scanner;

public class StudyCase02Soal05 {

	protected static Scanner input;

	public static void main(String[] args) {

		System.out.println("Masukkan input : ");
		input = new Scanner(System.in);
		String inputkata = input.nextLine();
		StringBuilder gantiinput = new StringBuilder();

		for (String word : inputkata.split(" ")) {
			gantiinput.append(replaceAll(word, '*'));
			gantiinput.append(" ");
		}

		System.out.println(gantiinput);

	}

	public static String replaceAll(String word, char replacer) {
		StringBuilder ret = new StringBuilder();
		
		if (word.length() > 2) {
			ret.append(word.charAt(0));
			for (int i = 1; i < word.length() - 1; i++) {
				ret.append(replacer);
			}
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();

		}
		return word;
	}

}