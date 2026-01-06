package singletonClass;

//Eager Initialization Singleton Class
public class Driver {
	public static void main(String[] args) {
		System.out.println(Manager.x);
		Manager m1 = Manager.getInstance();
		m1.name = "SuperAdmin";
		System.out.println("Manager name changed to: " + m1.name);
		Manager m2 = Manager.getInstance();
		Manager m3 = Manager.getInstance();
		System.out.println("m1 name: " + m1.name);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}
