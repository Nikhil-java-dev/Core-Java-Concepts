package singletonClass;

public class Manager {
	private final static Manager m = new Manager("Admin");
	static int x = 10;
	String name;
	
	private Manager(String name) {
		this.name = name;
		System.out.println("Manager object created for: " + name);
	}
	
	public static Manager getInstance() {
		System.out.println("Accessing Manager instance");
		return m;
	}
}
