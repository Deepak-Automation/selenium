package selenium;

class NewVehicle {
	
	NewVehicle(){
		System.out.println("default");
	}
	NewVehicle(int a, int b){
		this.run();
		System.out.println("parameterized");
	}
	
	
	
	void run() {
		System.out.println("Vehicle is running");
	}

	void run1() {
		//this.run();
		System.out.println("Vehicle is not running");
	}
}  

class Bike extends NewVehicle {
	void run() {
		super.run1();
		System.out.println("Bike is running safely");
	}}

public class ForLoopPattern{

	public static void main(String args[]) {
		Bike obj = new Bike();
		NewVehicle obj1 = new NewVehicle(2,3);
		obj.run();
	}
}
