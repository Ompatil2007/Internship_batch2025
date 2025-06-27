class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super(); // calling parent constructor
        System.out.println("Child class constructor called.");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
