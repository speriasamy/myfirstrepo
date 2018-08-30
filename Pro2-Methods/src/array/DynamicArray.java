package array;

import java.util.Scanner;

public class DynamicArray {
	
	public static void main(String[] args){
	System.out.println("Welcome to my program");
	Scanner kb=new Scanner(System.in);
	int[] age;  // Array range is not defined yet
	int noofpeople;
	int totage=0;
	System.out.println("Enter number of persons: ");
	noofpeople=kb.nextInt();
	age=new int[noofpeople];//Dynamic array is defined.
	for (int i=0;i<noofpeople;i++){
		System.out.println("Enter age of "+(i+1)+" person :");
		age[i]=kb.nextInt();
	}
	for (int i=0;i<age.length;i++){
		totage +=age[i];
		if (age[i]>40) System.out.println(i+" you are olderthan me"); // for one statement you don't need {}
	}
	System.out.println("The total age of all people is : "+ "\n"+totage);
	//System.out.println(age.); 
}
}
