package constructorChaining;

public class Car {
	String name;
	String color;
	int price;
	int hp;
	
	Car() {
		System.out.println("This is No-argument constructor...");
	}
	
	Car(String name) {
		this.name = name;
	}
	
	Car(String name, String color) {
		this(name);
		this.color = color;
	}
	 
	Car(String name, String color, int price ) {
		this(name, color);
		this.price = price;
	}
	
	Car(String name, String color, int price, int hp ) {
		this(name, color, price);
		this.hp = hp;
	}	
	
	public String getDetails() {
		return "Name is: " + name + "\nColor is: " + color + "\nPrice is: " + price + "\nHorse Power is: " + hp + "\n=======================";
	}
}
