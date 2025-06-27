class Car{
    int model;
    String name;
    public Car(int model,String name){
        this.model=model;
        this.name=name;
    }
    public Car(Car e){
        this(e.model,e.name);
            System.out.println("Model:"+model);
            System.out.println("Name:"+name);
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        Car d2=new Car(6585, "Mustang");
        Car c1=new Car(d2);
    }
}
