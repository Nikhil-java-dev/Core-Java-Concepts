package constructor;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("TATA");
		Car c3 = new Car("TATA", "Red");
		Car c4 = new Car("TATA", "Red", 6788558);
		Car c5 = new Car("TATA", "Red", 6788558, 1160);
		
		String details1 = c1.getDetails();
		String details2 = c2.getDetails();
		String details3 = c3.getDetails();
		String details4 = c4.getDetails();
		String details5 = c5.getDetails();
		
		System.out.println(details1);
		System.out.println(details2);
		System.out.println(details3);
		System.out.println(details4);
		System.out.println(details5);
	}
}
