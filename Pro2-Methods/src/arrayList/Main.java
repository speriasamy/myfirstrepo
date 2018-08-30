package arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to my programming");
		//ARRAY
		String[] sg=new String[3];
		
				sg[0]="Sasi";
				sg[1]="Chandu";
				sg[2]="Akilesh";
				
		//ArrayList
		ArrayList<String> al=new ArrayList<String>();
		
				al.add("Sasi");
				al.add("Chandu");
				al.add("Akilesh"); //ADD new data
				System.out.println(al);
				
		System.out.println(al.size());
		al.set(2, "Yasheen"); //modify the EXISTING value
		System.out.println(al.get(2));//get the value
		System.out.println(al);
		al.remove(2); //remove the existing value
		System.out.println(al);
		
		
	}
}
