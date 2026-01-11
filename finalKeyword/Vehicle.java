package finalKeyword;

public final class Vehicle {
	String type;
	int maxSpeed;
	int x = 10;
	
	public Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
	public String getType() {
		return type;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Vehicle [type=" + type + "\tmaxSpeed=" + maxSpeed + "]";
	}
}
