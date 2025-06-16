class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Assignment5{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // inherited method
        myDog.bark();  // method in Dog class
    }
}


