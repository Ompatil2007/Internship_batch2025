class Person{
    String name;
    int age;
    public Person(){
         name="Unknown";
         age=0;
        
    }
    void print(){
        System.out.println("Name"+name);
        System.out.println("age"+age);
    }

}
public class Assignment2 {
    public static void main(String[] args) {
        Person p=new Person();
        p.print();
    }
}
