package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordNode {
	
	String word;
	int topNumSteps;
	
	public WordNode(String word,int numSteps) {
		this.word=word;
		this.topNumSteps=numSteps;
	}
}
public class WordLadder {
	
	
	public static int searchWord(String startWord,String endWord,Set<String>wordDict) {
		
		LinkedList<WordNode>queue= new LinkedList<WordNode>();
		queue.add(new WordNode(startWord, 1));
		
		wordDict.add(endWord); //add word to end of dictionary
		
		while(!queue.isEmpty()) {
			
			WordNode wordNode=queue.remove();
			String word= wordNode.word;
			if(word.equals(endWord)) {
				return wordNode.topNumSteps;
			}
			
			char arr[] = word.toCharArray();
			for(int i=0;i <arr.length;i++) {
				for(char ch='a';ch<='z';ch++) {
					
					char temp= arr[i];
					if(arr[i]!=ch) {
						arr[i]=ch;
					}
					
					String newWord = new String(arr);
					if(wordDict.contains(newWord)) {
						queue.add(new WordNode(newWord,wordNode.topNumSteps+1));
						wordDict.remove(newWord);
					}
					arr[i]=temp;
				}
			}
		}
		return 0;
		
		
	}
	
	
	
	

  public static void main (String[] args) {
	  
	  String word= "hit";
	  String reqWord="cog";
	  String [] words= new String[] {"hot","dot","dog","lot","log"};
	  Set<String>dict = new HashSet<>(Arrays.asList(words));
	  System.out.println(searchWord(word, reqWord, dict));
  }
}
