package org.cloudwick.BubbleSort;

import java.util.Random;

public class MergeSort {
	private int[] numbers;
	 
	private int[] helper;

	private int number;

    public MergeSort(int[] values) {
	    this.numbers = values;
	    number = values.length;
	    this.helper = new int[number];
	    mergesort(0, number - 1);
	}

	  private void mergesort(int low, int high) {
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergesort(low, middle);
	      // Sort the right side of the array
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
	  }

	  private void merge(int low, int middle, int high) {

	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }

	 }
	  
	  public static void main(String[] args) {
		  int[] numArray = new int[10000];
		  Random randomInt = new Random();
		  int n = 0;
			while(n < 10000){
				numArray[n] = randomInt.nextInt(Integer.MAX_VALUE);
				n++;
			}
			long sms = System.currentTimeMillis();
		  MergeSort obj = new MergeSort(numArray);
		  long ems = System.currentTimeMillis();
		  long ms = ems= sms;
		  
		  System.out.println(ms);
	}
}
