package copyConstructor;


public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("TATA");
		Car c3 = new Car("MG", "Red");
		Car c4 = new Car("BMW", "Black", 9788558);
		Car c5 = new Car("Audi", "Red", 10788558, 2360);
		Car c6 = new Car(c5);
		Car c7 = new Car(c4);
		Car c8 = new Car(c3);
		
		String details1 = c1.getDetails();
		String details2 = c2.getDetails();
		String details3 = c3.getDetails();
		String details4 = c4.getDetails();
		String details5 = c5.getDetails();
		String details6 = c6.getDetails();
		String details7 = c7.getDetails();
		String details8 = c8.getDetails();
		
		System.out.println(details1);
		System.out.println(details2);
		System.out.println(details3);
		System.out.println(details4);
		System.out.println(details5);
		System.out.println(details6);
		System.out.println(details7);
		System.out.println(details8);
	}
}
