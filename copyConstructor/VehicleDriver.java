package copyConstructor;

public class VehicleDriver {
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Vehicle v1 = new Vehicle("Four Whealer");
		Vehicle v2 = new Vehicle("Two Whealer", "Petrol");
		Vehicle v3 = new Vehicle("Four Whealer", "Petrol", 2560);
		Vehicle v4 = new Vehicle(v1);
		Vehicle v5 = new Vehicle(v2);
		Vehicle v6 = new Vehicle(v3);
		
		String s1 = v.getDetails();
		String s2 = v1.getDetails();
		String s3 = v2.getDetails();
		String s4 = v3.getDetails();
		String s5 = v4.getDetails();
		String s6 = v5.getDetails();
		String s7 = v6.getDetails();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
	}
}
