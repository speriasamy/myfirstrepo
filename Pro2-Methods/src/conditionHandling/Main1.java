package conditionHandling;

import java.util.Scanner;

/*This program is to find the largest number of 3 also smallest number of 3
 * 
 */
public class Main1 {
public static void main(String[] args) {
	int n1,n2,n3,result;
	Scanner input=new Scanner(System.in);
	System.out.println("Welcome to my program.");
	System.out.println("Please enter number1");
	n1=Integer.parseInt(input.nextLine());
	System.out.println("Please enter number2");
	n2=Integer.parseInt(input.nextLine());
	System.out.println("Please enter number3");
	n3=Integer.parseInt(input.nextLine());
	Main1 obj=new Main1();
	result=obj.largest(n1, n2, n3);
	System.out.println("The larger of 3 is: "+result);
	result=obj.smallest(n1, n2, n3);
	System.out.println("The smallest of 3 is: "+result);
input.close();
}
	
public int largest(int a, int b, int c)
		{
			if ((a>b)&&(a>c)){
				return a;
			}
			else if ((b>a)&&(b>c)){
				return b;
			}
			else {
				return c;	
			}
			
		}
public int smallest(int a, int b, int c)
{
	if ((a<b)&&(a<c)){
		return a;
	}
	else if ((b<a)&&(b<c)){
		return b;
	}
	else {
		return c;	
	}
	
}
}
