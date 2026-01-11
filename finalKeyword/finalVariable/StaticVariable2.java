package finalKeyword.finalVariable;

public class StaticVariable2 {
	public static String companyName;
	
	static {
		companyName = "TechCorp";
	}
	public static void main(String[] args) {
		System.out.println("Company Name: " + StaticVariable.companyName);
	}
}
