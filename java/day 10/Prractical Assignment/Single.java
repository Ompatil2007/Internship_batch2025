// Implement single-level inheritance using Animal and Dog class. Call method from the parent class in child class.
class Animal{
String Name="Sheru";
void display(){
    System.out.println("Name"+Name);
} 
}
class Dog extends Animal{
    void displayInfo(){
        super.display();
        System.out.println("Dog is Barking");

    }

}
class Single{
    public static void main(String[] args){
        Dog d=new Dog();
        d.displayInfo();
        
    }
}