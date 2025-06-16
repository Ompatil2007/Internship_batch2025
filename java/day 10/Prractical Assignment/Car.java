package Demo.java;

public class Car {
int model;
String Name;
	public Car(int model,String Name) {
		this.model=model;
		this.Name=Name;
		
		
	}
	void  displayInfo() {
		System.out.print("Model:"+model);
		System.out.print("Name:"+Name);
	}

	public static void main(String[] args) {
	Car c=new Car(258,"mustang");
	c.displayInfo();
	

	}

}
