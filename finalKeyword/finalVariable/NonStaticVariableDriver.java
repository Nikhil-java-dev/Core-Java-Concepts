package finalKeyword.finalVariable;

public class NonStaticVariableDriver {
	public static void main(String[] args) {
		NonStaticVariable car2 = new NonStaticVariable("Honda", "CD456EF");
		NonStaticVariable car3 = new NonStaticVariable("Toyota", "AB123CD");
		NonStaticVariable car4 = new NonStaticVariable(25000, "GH789IJ");
		NonStaticVariable car5 = new NonStaticVariable("Ford", "XY987ZT", 30000);

		System.out.println("Car 2: Name = " + car2.name + ", Price = " + car2.price);
		System.out.println("Car 3: Name = " + car3.name + ", Car No = " + car3.carno + ", Price = " + car3.price);
		System.out.println("Car 4: Name = " + car4.name + ", Car No = " + car4.carno + ", Price = " + car4.price);
		System.out.println("Car 5: Name = " + car5.name + ", Car No = " + car5.carno + ", Price = " + car5.price);
	}
}
