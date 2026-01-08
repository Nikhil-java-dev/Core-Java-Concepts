package copyConstructor;

public class FruitDriver {
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("mango", 2.3, 120);
		Fruit f3 = new Fruit("Apple", 3.4, 280);
		int x = 70;
		Fruit f4 = new Fruit(x);
		Fruit f5 = new Fruit(f2);
		Fruit f6 = new Fruit(f3);
		Fruit f7 = new Fruit(f4);
		
		System.out.println(f1.getDetails());
		System.out.println(f2.getDetails());
		System.out.println(f3.getDetails());
		System.out.println(f4.getDetails());
		System.out.println(f5.getDetails());
		System.out.println(f6.getDetails());
		System.out.println(f7.getDetails());
	}
}
