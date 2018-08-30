package sort;

import java.util.Arrays;
import java.util.Collections;


public class Arrays_Sort {

	public static void main(String[] args) {
		////////////ARRAY////////////////////////////////////
		/*
		 * Arrays.sort works for arrays which can be of primitive data type also. 
		 * Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.
		 * 
		 */
	int[] array1={15,02,66,35,67,43,33,45,67,23,45};
	int[] array2={15,02,66,35,67,43,33,45,67,23,45};
	Integer[] array3={15,02,66,35,67,43,33,45,67,23,45};
	//int[] array2 = {13, 7, 6, 45, 21, 9, 2, 100};
	System.out.println("Original Array : "+Arrays.toString(array1));
	Arrays.sort(array1);
	System.out.println("Modified arr[] : "+Arrays.toString(array1));
	///sort(int[] arr, int from_Index(inclusive), int to_Index(exclusive))
	///sorting sub array
	System.out.println("Original Array : "+Arrays.toString(array2));
	//Arrays.sort(array2, 1, 3);
	Arrays.sort(array2, 1, 5);
	System.out.println("Modified arr[] : "+Arrays.toString(array2));
	System.out.println("Original Array : "+Arrays.toString(array3));
	Arrays.sort(array3, Collections.reverseOrder());
	System.out.println("Original Array : "+Arrays.toString(array3));
	
	}

}
