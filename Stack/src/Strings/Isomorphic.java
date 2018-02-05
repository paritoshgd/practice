package Strings;

import java.util.HashMap;

public class Isomorphic {
	
	public static boolean isIsomorphic(String s, String t) {
		
		boolean result =false;
		if(s.length()==0 || t.length()==0) {
			return result;
		}
		if(s.length()!=t.length()) {
			return result;
		}
		
		HashMap<Character,Character>map = new HashMap<>();
		for(int i=0; i< s.length();i++) {
			
			char c = s.charAt(i);
			char d = t.charAt(i);
			// if the character is not present in the map then add it to the map 
			if(!map.containsKey(c)) {
				map.put(c,d);
			
			}
			else  if (map.containsKey(c)){
				
				char temp =map.get(c);
				if(temp!=d) {
					return false;
				}
				else {
					result=true;
				}
			}
		}
		return result;
		
	}
	
	public static void main(String [] args) {
		
		boolean val = isIsomorphic("ab", "aa");
		System.out.println(val);
	}

}
