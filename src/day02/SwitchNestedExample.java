package day02;

public class SwitchNestedExample {

	public static void main(String[] args) {
		
		char branch = 'C';
		int collegeYear = 4;
		switch (collegeYear) {
		case 1:
			System.out.println("English,Maths,Science");
			break;
		case 2:
			switch (branch ) {
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E':
				System.out.println("Mirco processor, Logic Switching Theory");
				break;
			case 'M':
				System.out.println("Drawing, Manufacturing mahchines");
				break;
			}
			break;
		case 3: 
			switch (branch) {
			case 'C':
				System.out.println("Computer Organization, Multimedia");
				break;
			case 'E':
				System.out.println("Fundamentals of Logic Design, Microelectronic");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
				break;
			}
			break;
		case 4:
			switch (branch) {
			case 'C':
				System.out.println("Data Communication and networks, Multimedia");
				break;
			case 'E':
				System.out.println("Embedded System, Image Processing");
				break;
			case 'M':
				System.out.println("Production Technology, Thermal Engineering");
				break;
			}
			break;
		}

	}

}
