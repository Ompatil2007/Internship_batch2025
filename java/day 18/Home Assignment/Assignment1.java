class Parent {
    int number = 100;
}

class Child extends Parent {
    int number = 200;

    void display() {
        System.out.println("Child class number: " + number);
        System.out.println("Parent class number: " + super.number); // accessing parent class variable
    }
}

public classAssignment1{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
