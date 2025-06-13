
class Vehicle{
String num="MH 15 KB 6963";

}
class Bike extends Vehicle{
	String model1="df52";
	String Name1="Kawasaki";
	
	void display1() {
		System.out.println("Number:"+num);
		System.out.println("Model:"+model1);
		System.out.println("Name:"+Name1);
	}
	
	
}
class Car extends Vehicle{
	String model2="dfg52";
	String Name2="Fortuner";
	
	void display() {
		System.out.println("Number:"+num);
		System.out.println("Model:"+model2);
		System.out.println("Name:"+Name2);
	}
}

public class Main1 {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.display1();
		Car c=new Car();
		c.display();
	}

}
