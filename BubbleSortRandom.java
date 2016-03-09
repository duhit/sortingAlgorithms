package org.cloudwick.BubbleSort;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSortRandom {
	
	public static int[] generateRandomIntList(){
		int[] integerList = new int[10000];
		Random randomInt = new Random();
		int n = 0;
		while(n < 10000){
			integerList[n] = randomInt.nextInt(Integer.MAX_VALUE);
			n++;
		}
		System.out.println(integerList.length);
		return integerList;
	}
	public static void main(String[] args) {
		
		int[] list = generateRandomIntList();
		int n = list.length;
		int temp = 0;
		long sms = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
		    for (int j = 1; j < (n - i-1); j++) {

		        if (list[j - 1] > list[j]) {
		            temp = list[j - 1];
		            list[j - 1] = list[j];
		            list[j] = temp;
		        }
		    }
		}
		long ems = System.currentTimeMillis();
		long ms = ems - sms;
		System.out.println( "Time take = "+ms);
	}
}