class Parent {
    Parent(String name) {
        System.out.println("Parent constructor called with name: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name); // calling parent parameterized constructor
        System.out.println("Child constructor called.");
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Child obj = new Child("Om Patil");
    }
}
