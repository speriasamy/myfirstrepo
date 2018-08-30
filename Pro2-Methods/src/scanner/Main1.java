package scanner;

import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	System.out.println("welcome to my program");
	System.out.println("Please enter your name:");
	String name="";
	Scanner kb1=new Scanner(System.in);
	name=kb1.nextLine();
	System.out.println("Hi "+name);
	kb1.close();

}
}
