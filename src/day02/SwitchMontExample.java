package day02;

public class SwitchMontExample {

	public static void main(String[] args) {
		
		int month = 8;
		String monthString = "";
		
		switch (month) {
		
		case 1:
			monthString = "1 - Januari";
			break;
		case 2:
			monthString = "2 - Februari";
			break;
		case 3:
			monthString = "3 - Maret";
			break;
		case 4:
			monthString = "4 - April";
			break;
		case 5:
			monthString = "5 - Mei";
			break;
		case 6:
			monthString = "6 - Juni";
			break;
		case 7:
			monthString = "7 - Juli";
			break;
		case 8:
			monthString = "8 - Agustus";
			break;
		case 9:
			monthString = "9 - September";
			break;
		case 10:
			monthString = "10 - Oktober";
			break;
		case 11:
			monthString = "11 - November";
			break;
		case 12:
			monthString = "12 - Desember";
			break;
		default:
			System.out.println("Invalid Month!");
		}
		
		System.out.println(monthString);
	}

}
