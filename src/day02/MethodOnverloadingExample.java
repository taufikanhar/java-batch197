package day02;

public class MethodOnverloadingExample {

	public static void main(String[] args) {
		// memanggil method add
		System.out.println(add(11, 11));
		// memanggil method add
		System.out.println(add (11, 11, 11));
		
	}
	
	static int add(int a, int b) {
		return a + b;
	}

	static int add (int a, int b, int c) {
		return a + b + c;
	}
}
