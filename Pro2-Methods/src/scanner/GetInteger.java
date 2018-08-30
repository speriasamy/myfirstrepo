package scanner;

import java.util.Scanner;

public class GetInteger {
public static void main(String[] args) {
	System.out.println("Welcome to my programming");
	Scanner kb=new Scanner(System.in);
	int i;
	System.out.println("Plese enter your age:");
	i=kb.nextInt();
	if (i>=65) {
		System.out.println("You are retired");
	}
	else if (i>=40){
		System.out.println("You are middleaged");
	}
	else if (i>=20){
		System.out.println("You are still young");
	}
	else {
		System.out.println("you are just a kid");
	}
	kb.close();
}
}
