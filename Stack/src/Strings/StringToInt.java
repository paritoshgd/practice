package Strings;

public class StringToInt {

	public static int stringToInt(String s) {
		
		double result=0;
		int i=0;
		if(s==null||s.length()==0)
			return 0;
		
		//trim white space
		s=s.trim();
		// handle for signs +/-
		char flag='+';
		
		if(s.charAt(0)=='-') {
			flag='-';
			i++;
		}else if(s.charAt(0)=='+') {
			i++;
		}
		
		while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9') {
			result= result*10+(s.charAt(i)-'0');
			i++;
		}
		//handle for integer max value and min value
		if( result >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if(result <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		if(flag=='-') {
			result=-result;
		}
		return (int)result;
	
	}
	
	public static void main(String args[]) {
		
		System.out.println(stringToInt("+49"));
		System.out.println(stringToInt("-49"));
		System.out.println(stringToInt("49"));
		
	}
}


