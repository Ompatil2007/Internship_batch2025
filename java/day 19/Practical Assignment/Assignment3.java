class Student{
    int id, marks;
    String name;
    public Student(int id ,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void print(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Student s=new Student(18, "Om Patil", 100);
        s.print();
    }
}
