package JavaConcepts;

import java.util.Arrays;
import java.util.HashMap;

public class NutsAndBoltsHashMap {

	 static void matchNutsAndBolts(char[] nuts,char[] bolts) {
		
		 //hashmap stores the nut and the index of the nut
		HashMap<Character,Integer>hashmap = new HashMap();
		
		for(int i=0;i<nuts.length;i++)
			hashmap.put(nuts[i], i);
		
		for(int i=0;i<bolts.length;i++) {
			
			if(hashmap.containsKey(bolts[i])) {
				nuts[i]=bolts[i];
			}
			else {
				System.out.println("There is no mapping for bolt "+bolts[i]);
			}
		}
		 
		 System.out.println("(Hash Map) Matched nuts and bolts are: ");
	        System.out.println(Arrays.toString(nuts));
	        System.out.println(Arrays.toString(bolts));
	 }
	 
	 public static void main(String[] args) {
		 
		 char[] nuts = {'$', '%', '&', 'x', '@'};
	        char[] bolts = {'%', '@', 'x', '$', '&'};
	        matchNutsAndBolts(nuts, bolts);
	 }
}
