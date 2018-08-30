package classes;

// static variable in the method
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		Person p1=new Person("sasi");
		Person p2=new Person ("chandu");
		Person p3=new Person("venkat");
		System.out.println(Person.noofperson);
		//System.out.println(p1.noofperson);
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}

}
