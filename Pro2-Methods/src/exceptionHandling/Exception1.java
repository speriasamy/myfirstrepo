package exceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("welcome to my program");
		System.out.println("please enter your age:");
		Scanner kb=new Scanner(System.in);
		try {
			int i = kb.nextInt();
			System.out.println("your age is "+i);
		} catch (Exception e) {
			System.out.println("you have entered invalid number");
			System.out.println("below is the actual exception");
			System.out.println("==============================");
			System.out.println(e);
			System.out.println("===============================");
		}
		kb.close();
		System.out.println("end of the program");
		
	}
}
