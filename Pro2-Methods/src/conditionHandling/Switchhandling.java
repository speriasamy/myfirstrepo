package conditionHandling;

import java.util.Scanner;

public class Switchhandling {
public static void main(String[] args) {
	System.out.println("welcome to my program:Enter your age");
	Scanner kb=new Scanner(System.in);
	int i;
	i=kb.nextInt();
	switch (i) {
	case 65:
		System.out.println("You are retired");
		break;
	case 40:
		System.out.println("You are middle aged");
		break;
	case 20:
		System.out.println("You are still young");
		break;
	case 18:
		System.out.println("you are just a kid");
		break;
	default:
		System.out.println("what?");
	}
	kb.close();
}
}
