package Strings;

import java.util.ArrayList;

public class ReverseVowelsForString {
	
	public static String reverseVowelsStr(String s) {
		
		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add('a');
		arrayList.add('e');
		arrayList.add('i');
		arrayList.add('o');
		arrayList.add('u');
		arrayList.add('A');
		arrayList.add('E');
		arrayList.add('I');
		arrayList.add('O');
		arrayList.add('U');
		
		int i=0;
		int j= s.length()-1;
		char[] a = s.toCharArray();
		
		while(i<j) {
			
			if(!arrayList.contains(a[i])) {
				i++;
				continue;
			}
			
			if(!arrayList.contains(a[j])) {
				j--;
				continue;
			}
			
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
			
	}
	
	public static void main(String[] args) {
		System.out.println(reverseVowelsStr("abcde"));
	}

}
