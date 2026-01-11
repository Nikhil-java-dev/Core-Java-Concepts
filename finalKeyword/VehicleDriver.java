package finalKeyword;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle car = new Vehicle("Car", 180);
		Vehicle bike = new Vehicle("Bike", 120);
		Vehicle truck = new Vehicle("Truck", 100);

		System.out.println(car);
		System.out.println(bike);
		System.out.println(truck);
		System.out.println("Car x value: " + car.x);
		car.x = 20;
		System.out.println("Car x value: " + car.x);
	}
	
}
