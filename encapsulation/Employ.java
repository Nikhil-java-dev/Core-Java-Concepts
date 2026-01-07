package encapsulation;

public class Employ {
	private int age;
	
	public void setAge(int age) {
		if(age >= 18 && age < 65)
			this.age = age;
		else
			System.out.println("Invalid age is: " + age);
		        
	}
	
	public String getAge() {
		return "Age is: " + age;
	}
}
