package day01;

public class SimpleArraySum {

	public static void main(String[] args) {
	
		System.out.println(simpleArraySum(new int[] {1,2,3,4,10,11}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4,5,21,22,25}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4));
}

	static int simpleArraySum(int[]ar) {
			int hasil = 0;
			for (int i = 0; i < ar.length; i++) {
				hasil+ar[i];
				
			}
			return hasil;
			}
	