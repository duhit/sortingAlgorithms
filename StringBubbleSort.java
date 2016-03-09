package org.cloudwick.BubbleSort;

import java.util.ArrayList;

public class StringBubbleSort {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("Duhit");
		wordList.add("Glasgow");
		wordList.add("Cloudwick");
		wordList.add("Leicester");
		wordList.add("Scotland");
		
		System.out.println(wordList);
		if(wordList.size() > 1){
			for(int i = 0; i < wordList.size(); i++){
				for(int j = 0; j < wordList.size()-i-1; j++){
					if((wordList.get(j)).compareTo(wordList.get(j+1)) > 0){
						String temp = wordList.get(j);
						wordList.set(j, wordList.get(j+1));
						wordList.set(1+j, temp);
					}
				}
			}
			System.out.println(wordList);
		}
	}
}
