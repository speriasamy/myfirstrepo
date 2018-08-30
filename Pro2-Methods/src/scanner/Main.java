package scanner;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	String name="";
	int age=0;
	System.out.println("Welcome to my program");
	System.out.println("Please type your name and click ENTER key");
	Scanner kb1=new Scanner(System.in);
	name=kb1.nextLine();
	System.out.println("Hi "+name.toUpperCase()+":)");
	System.out.println("Enter your age :");
	name=kb1.nextLine();
	age=Integer.parseInt(name);
	System.out.println("You are going to be "+(age+10)+" in 10 years");
	kb1.close();
}
}
