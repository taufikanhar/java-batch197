package day02;

public class IfNestedExample2 {

	public static void main(String[] args) {
		int umur = 25;
		int berat = 48;
		
		if (umur >=18) {
			if (berat > 50) {
				System.out.println("Kamu bisa mendonor darah");
			}
			else {
				System.out.println("Kamu tidak bisa mendonor darah");
			}
			}else {
				System.out.println("umur harus di atas 18 tahun");
			}
		}

	}


