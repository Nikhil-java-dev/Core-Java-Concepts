package copyConstructor;

public class Vehicle {
	String name;
	String type;
	int hp;
	
	Vehicle(){
		
	}
	
	Vehicle(String name){
		this.name = name;
	}
	
	Vehicle(String name, String type){
		this(name);
		this.type = type;
	}
	
	Vehicle(String name, String type, int hp){
		this(name, type);
		this.hp = hp;
	}
	
	Vehicle(Vehicle v){
		this(v.name, v.type, v.hp);
	}
	
	public String getDetails() {
		return "Name is: " + name + "\nType is: " + type + "\nHorce Power is: " + hp + "\n====================";
	}
}
