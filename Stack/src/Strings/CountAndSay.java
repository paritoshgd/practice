package Strings;

public class CountAndSay {
	
	public static String printSequence(int n) {
		
		String result="1";
		int i=1;
		

		while(i<n) {
			StringBuilder sb = new StringBuilder();
			int count=1;
			
			for(int j=1;j<result.length();j++) {
				
				if(result.charAt(j)==result.charAt(j-1)) {
					count++;
				}else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;					
				}
			}
			
			sb.append(count);
			System.out.println(result.charAt(result.length()-1));
			sb.append(result.charAt(result.length()-1));
			result=sb.toString();
			i++;
		}
				
		return result;
		
	}

	public static void main(String[] args) {
		
		String str= printSequence(2);
		System.out.println(str);
	}
}
