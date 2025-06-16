class Teacher{
    String name,subject;
    public Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
}
class MathTeacher extends Teacher{
    int experienceyear;
    public MathTeacher(String name, String subject, int experienceyear){
        super(name,subject);
        this.experienceyear=experienceyear;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Subject:"+subject);
        System.out.println("Experence Year:"+experienceyear);
    }

}

public class Assignment4 {
public static void main(String[] args) {
    MathTeacher m=new MathTeacher("Om Patil", "Mathematics", 7);
    m.display();
}    
}
