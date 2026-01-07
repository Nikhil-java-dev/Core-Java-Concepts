package encapsulation;

import java.util.Scanner;

public class LaptopDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop l1 = new Laptop();
		System.out.println("Enter The Laptop Name ");
		String name = sc.nextLine();
		System.out.println("Enter The Laptop Price");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Laptop Color");
		String color = sc.nextLine();
		sc.close();
		
		l1.setName(name);
		l1.setPrice(price);
		l1.setColor(color);
		
		System.out.println("======== LAPTOP DETAILS ARE ========");
		System.out.println("Name is: " + l1.getName());
		System.out.println("Price is: " + l1.getPrice());
		System.out.println("Color is: " + l1.getColor());
	}

}
