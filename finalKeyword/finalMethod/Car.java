package finalKeyword.finalMethod;

public class Car extends Vehicle {
	
	@Override
	public void start() {
        System.out.println("Car is starting");
    }
	
	// This will cause a compile-time error
	//	@Override
//	public void stop() {
//		System.out.println("Car is stopping");
//			
//		}

}
