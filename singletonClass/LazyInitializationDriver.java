package singletonClass;

public class LazyInitializationDriver {
	public static void main(String[] args) {
		System.out.println(LazyInitialization.x);
		LazyInitialization m1 = LazyInitialization.getInstance();
		m1.name = "SuperAdmin";
		System.out.println("Manager name changed to: " + m1.name);
		LazyInitialization m2 = LazyInitialization.getInstance();
		LazyInitialization m3 = LazyInitialization.getInstance();
		System.out.println("m1 name: " + m1.name);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}
