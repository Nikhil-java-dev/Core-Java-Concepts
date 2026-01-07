package encapsulation;

public class Employ1 {
	private String name;
	private int age;
	private double salary;
	
	public void setName(String name) {
		if(name.matches("[A-Za-z]+(\\s[A-Za-z]+)*"))
			this.name = name;
		else
			IO.println("INVALID NAME");
	}
	
	public void setAge(int age) {
		if(age >= 18 && age <= 65)
			this.age = age;
		else
			IO.println("INVALID AGE");
	}
	
	public void setSalary(double salary) {
		if(salary > 18000)
			this.salary = salary;
		else
			IO.println("INVALID SALARY");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}

}
