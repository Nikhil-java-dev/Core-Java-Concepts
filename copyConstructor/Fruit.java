package copyConstructor;

public class Fruit {
	String name;
	double weight;
	int price;
	
	Fruit(){
		
	}
	
	Fruit(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	Fruit(int price) {
		this.price = price;
	}
	
	Fruit(Fruit f){
		this(f.name, f.weight, f.price);
	}
	
	public String getDetails() {
		return "Name is: " + name + "\nWeight is: " + weight + "\nPrice is: " + price + "\n===================";
	}
}
