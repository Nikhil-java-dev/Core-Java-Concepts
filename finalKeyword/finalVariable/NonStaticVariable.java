package finalKeyword.finalVariable;

public class NonStaticVariable {
	String name;
	final String carno;
	int price;
	
	NonStaticVariable(String carno, int price, String name) {
		this.name = name;
		this.carno = carno;
		this.price = price;
	}
	
	NonStaticVariable(String name, String carno) {
		this.name = name;
		this.carno = carno;
	}

	NonStaticVariable(String carno, int price) {
		this.carno = carno;
		this.price = price;
	}
	
	NonStaticVariable(int price, String carno) {
		this.carno = carno;
		this.price = price;
	}
	
	public NonStaticVariable(String name, String carno, int price) {
		this.name = name;
		this.carno = carno;
		this.price = price;
	}
	
}
