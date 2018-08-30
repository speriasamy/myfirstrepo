package conditionHandling;

import java.util.Scanner;

/*This program is going to check if the
 * 1. number is -ve or not
 * 2. number is zero or not
 * 3. number is odd or even
 */
public class Main {

	public static void main(String[] args) {
		String inputno;
		int i; 
	System.out.println("Welcome to conditional Handling");
	System.out.println("Please input the number");
	Scanner input=new Scanner(System.in);
	inputno=input.nextLine();
	i=Integer.parseInt(inputno);
	input.close();
	System.out.println(i);
	if (i<0)
	{
		System.out.println(i+" is a negative number");
	}
	else if (i==0){System.out.println(i+ " is zero");}
	else if (i%2==0){System.out.println(i+ " is even number");	 }
	else 
	{
	System.out.println(i+ " is odd number");		
		
	}
}
}
