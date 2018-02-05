package Strings;

public class LengthOfLastWord {
	
	public static int lastWordLength(String s) {
		
		int result=0;
		boolean flag=false;
		for(int i=s.length()-1;i>=0;i--) {
			
			 // Once the first chracter from last
            // is encountered, set char_flag to true.
			char c= s.charAt(i);
			
			if((c>='a'&& c <='z')||(c>='A'&&c<='Z')) {
				
				flag=true;
				result++;
			}else {
				
				// When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
				if(flag) {
					return result;
				}
			}
			
		}
		// if there is no special character like space etc you still need to return the result as is. 
		return result;
	}
	
	public static void main(String []args) {
		
		System.out.println(lastWordLength("Geeks For Geeks"));
		
		System.out.println(lastWordLength("Geek**"));
	}

}
