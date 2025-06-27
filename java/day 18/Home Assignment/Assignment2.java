class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class method.");
        super.show(); // calling parent method
    }
}

public class Assignment2{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
