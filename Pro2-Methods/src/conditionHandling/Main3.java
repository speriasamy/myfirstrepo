package conditionHandling;

import java.util.Scanner;

/*write a program to input mark of 5 subject. calculate 
 * percentage and grade according to the following 
 * >90% -A
 * >80% B
 * >70%  c
 * >60% D
 * >40% E
 * <40% F
 */
public class Main3 {
public static void main(String[] args) {
	int phy,chem,Bio,Maths,comp=0;
	System.out.println("Welcome to my program");
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter Physics mark:");
	phy=Integer.parseInt(input.nextLine());
	if (phy<0 || phy>100){ System.out.println("Invalid marks. re-enter again");
	phy=Integer.parseInt(input.nextLine());	
	}
	System.out.println("Please enter Chemistry mark:");
	chem=Integer.parseInt(input.nextLine());
	System.out.println("Please enter Biology mark:");
	Bio=Integer.parseInt(input.nextLine());
	System.out.println("Please enter Mathemetics mark:");
	Maths=Integer.parseInt(input.nextLine());
	System.out.println("Please enter Computer science mark:");
	comp=Integer.parseInt(input.nextLine());
	Grade g=new Grade();
	System.out.println("Here are the results:");
	System.out.println("---------------------------");
	System.out.println("Physics          : Grade "+g.clculategrade(phy));
	System.out.println("Chemistry        : Grade "+g.clculategrade(chem));
	System.out.println("Biology          : Grade "+g.clculategrade(Bio));
	System.out.println("Mathemetics      : Grade "+g.clculategrade(Maths));
	System.out.println("Computer science : Grade "+g.clculategrade(comp));
	System.out.println("---------------------------");
	input.close();
}
}
