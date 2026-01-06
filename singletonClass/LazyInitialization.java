package singletonClass;

public class LazyInitialization {
	private static LazyInitialization m =null;
	static int x = 10;
	String name;
	
	private LazyInitialization(String name) {
		this.name = name;
		System.out.println("Manager object created for: " + name);
	}
	
	public static LazyInitialization getInstance() {
		if(m == null) {
            m = new LazyInitialization("Admin");
		}
		System.out.println("Accessing Manager instance");
		return m;
	}
}
