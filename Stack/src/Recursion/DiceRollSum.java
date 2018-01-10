package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceRollSum {
	
	static void diceRoll(int dice,int desiredSum,int sumSoFar,List<Integer>chosen) {
		
		if(dice==0) {
			System.out.println(chosen.toString());
		}
		else {
			for(int i=1;i<=6;i++) {
				
			if(sumSoFar+i+1*(dice-1)<=desiredSum && sumSoFar+i+6*(dice-1)>=desiredSum) {
			chosen.add(i);
			diceRoll(dice-1,desiredSum,sumSoFar+i,chosen);
			chosen.remove(chosen.size()-1);
		 }
			}
		}

	}
	
	public static void main(String args[]) {
		
		List<Integer>chosen= new ArrayList<Integer>();
		diceRoll(2,12,0,chosen);
	}
}
