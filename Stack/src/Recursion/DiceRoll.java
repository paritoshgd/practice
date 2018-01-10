package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
	
	static void diceRoll(int dice,List<Integer>chosen) {
		
		if(dice==0) {
			System.out.println(chosen.toString());
		}
		else {
			for(int i=1;i<=6;i++) {
			chosen.add(i);
			diceRoll(dice-1,chosen);
			chosen.remove(chosen.size()-1);
		 }
		}

	}
	
	public static void main(String args[]) {
		
		List<Integer>chosen= new ArrayList<Integer>();
		diceRoll(2,chosen);
	}
}
