package day02;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(array[1]);
		// 1 adalah index nya, index ke 1, index array selalu dari 0
		System.out.println(array[4]);
		// index ke 4 array
		System.out.println(array[0]);
		//index ke 0 array
		int hasil =0;
		for (int a = 0; a < array.length; a++) {
			System.out.print(array[a]);
			hasil=hasil+array[a];
			// hasil = hasil sebelum nya "0" ditambah kan dengan array
		}
	
		
	}

	static int diagonalDifference(int[][]arr) {
		int hasil = 0;
		return hasil;
	}
}
