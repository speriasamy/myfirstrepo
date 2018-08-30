package conditionHandling;

import java.util.Scanner;

/*This program is to check whether a number is divisible by 5 and 11 or not
 * 
 */
public class Main2 {
public static void main(String[] args) {
	System.out.println("Welcome to my program");
	System.out.println("Please enter the number: ");
	Scanner input=new Scanner(System.in);
	int i=Integer.parseInt(input.nextLine());
	Divisible d=new Divisible();
	if (d.Divisibleby5(i)&& d.Divisibleby11(i))
	{
		System.out.println("This number is divisible by both 5 and 11");
	}
	else if (d.Divisibleby5(i))
	{
		System.out.println("This number is divisible only by 5");
	}
	else if (d.Divisibleby11(i))
	{
		System.out.println("This number is divisible only by 11");
	}
	else
	{
		System.out.println("This number is NOT divisible by 5 or 11");
	}
	input.close();
}
}
