package Strings;
//Check if a given string is sum-string
//“12243660” is a sum string. 
//Explanation : 24 + 36 = 60, 12 + 24 = 36
public class sumString {
	
	public static void main(String[] args) {
	String s= "1111112223";
    boolean isSumString=false;
	int[] num=new int[s.length()/2 ];
	int j=0;
	 for(int i=s.length();i>0;i=i-2) {
		 
		 num[j]=Integer.parseInt(s.substring(i-2,i));
		 j=j+1;
		 
	 }
	 
	 for(int i=0;i<num.length;i++) {
		 System.out.print(num[i]+" ");
	 }
	 
	 for(int i=0;i<num.length/2;i++) {
		 
		 if(num[i]==num[i+1]+num[i+2]) {
			 isSumString=true;
		 }
		 else {
			 isSumString=false;
		 }
		}
	 System.out.println(isSumString);
	 
}
}