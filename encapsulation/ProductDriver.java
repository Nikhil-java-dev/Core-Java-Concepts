package encapsulation;

import java.util.Scanner;

public class ProductDriver {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Product p1 = new Product();
			System.out.println("Enter The Product Name ");
			String name = sc.nextLine();
			System.out.println("Enter The Product Price");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter The Product ID");
			int id = sc.nextInt();
			sc.close();
			
			p1.setName(name);
			p1.setPrice(price);
			p1.setId(id);
			
			System.out.println("======== PRODUCT DETAILS ARE ========");
			System.out.println("Name is: " + p1.getName());
			System.out.println("Price is: " + p1.getPrice());
			System.out.println("ID is: " + p1.getId());
		}

	}
