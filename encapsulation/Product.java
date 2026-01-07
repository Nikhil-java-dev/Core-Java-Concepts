package encapsulation;

public class Product {
	private String name;
	private int price;
	private int id;
	
	public void setName(String name) {
		if(name.matches("[A-Za-z]+(\\s[A-Za-z]+)*"))
			this.name = name;
		else
			IO.println("INVALID NAME");
	}
	
	public void setPrice(int price) {
		if(price > 0 )
			this.price = price;
		else
			IO.println("INVALID Price");
	}
	
	public void setId(int id) {
		if(id > 0)
			this.id = id;
		else
			IO.println("INVALID ID");
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getId() {
		return id;
	}

}


