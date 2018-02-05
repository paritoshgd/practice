package Strings;

public class MoveZeros {
	
	public static void MoveZeros( int[] arr) {
		
	int m=-1;
	for (int i=0;i<arr.length;i++) {
		
		if(arr[i]==0) {
			if(m==-1||arr[m]!=0) {
				m=i;
			}
		}else {
			
			if(m!=-1) {
				
				int temp= arr[m];
				arr[m]=arr[i];
				arr[i]=temp;
				m++;
			}
		}
	}
   for(int i=0;i<arr.length;i++) {
	   System.out.print(arr[i]);
   }

}
	public static void main(String[] args) {
		int [] arr = {1,0,2,0};
		MoveZeros(arr);
	}
}