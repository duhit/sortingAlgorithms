package org.cloudwick.BubbleSort;

public class IntegerBubleSort {
	public static void main(String[] args) {
		int[] integerList = {20,10,80,50,30};
		int n = integerList.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
		    for (int j = 1; j < (n - i); j++) {

		        if (integerList[j - 1] > integerList[j]) {
		            temp = integerList[j - 1];
		            integerList[j - 1] = integerList[j];
		            integerList[j] = temp;
		        }
		    }
		}
		for(int x = 0; x <n; x++ )
		System.out.println(integerList[x]);
	}
	

}