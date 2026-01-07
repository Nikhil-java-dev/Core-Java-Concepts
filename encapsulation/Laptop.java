package encapsulation;

public class Laptop {
	private String name;
	private int price;
	private String color;
	
	public void setName(String name) {
		if(name.matches("[A-Za-z]+(\\s[A-Za-z]+)*"))
			this.name = name;
		else
			IO.println("INVALID NAME");   								
	}
	
	public void setPrice(int price) {
		if(price >= 35000)
			this.price = price;
		else
			IO.println("INVALID AGE");
	}
	
	public void setColor(String color) {
		if(color.matches("[A-Za-z]+(\\s[A-Za-z]+)*"))
			this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}

}
