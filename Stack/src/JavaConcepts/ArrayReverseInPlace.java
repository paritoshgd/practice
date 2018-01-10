package JavaConcepts;

public class ArrayReverseInPlace {

	public static void main(String[] args ) {
	
	int [] arrayEven = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int [] arrayOdd = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println("Even array size " + arrayEven.length);
	System.out.println("Odd"
			+ " array size " + arrayOdd.length);
	arrayReverse(arrayEven);
	System.out.println();
	arrayReverse(arrayOdd);
	
	}

	public static void  arrayReverse(int []array) {
		
		for(int i=0 ;i<array.length/2;i++) {
			
			int temp = array[i];
			array[i]= array[array.length-1 -i];
			array[array.length-1 -i] = temp;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		
	}
}
