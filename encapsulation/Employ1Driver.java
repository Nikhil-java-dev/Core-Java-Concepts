package encapsulation;

import java.util.Scanner;

public class Employ1Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ1 e1 = new Employ1();
		System.out.println("Enter The Employ Name ");
		String name = sc.nextLine();
		System.out.println("Enter The Employ Age");
		int age = sc.nextInt();
		System.out.println("Enter The Employ Salary");
		double salary = sc.nextDouble();
		sc.close();
		
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		
		System.out.println("======== EMPLOYEES DETAILS ARE ========");
		System.out.println("Name is: " + e1.getName());
		System.out.println("Age is: " + e1.getAge());
		System.out.println("Salary is: " + e1.getSalary());
	}

}
