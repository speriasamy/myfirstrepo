package sort;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Sort {

	public static void main(String[] args) {
		/////////////ARRAYLIST///////////////////////////
		/*
		 * Arrays.sort works for arrays which can be of primitive data type also. 
		 * Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.
		 * 
		 */
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(02);
		al.add(66);
		al.add(35);
		ArrayList<Integer> temp=new ArrayList<Integer>();
		System.out.println("Original Arraylist: "+al);
		temp=al;
		//SORT in ascending order
		Collections.sort(al);
		System.out.println("Sorted Arraylist in Ascending order: "+al);
		Collections.reverse(al);
		System.out.println("Sorted Arraylist in Decending order: "+al);
		Collections.sort(temp, Collections.reverseOrder());
		System.out.println("Sorted Arraylist in Decending order: "+ temp);
		
		
	}

}
