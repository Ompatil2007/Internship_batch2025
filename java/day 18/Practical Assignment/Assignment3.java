 class Student {
    int rollNo;
    String name;
    double percentage;

    Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;

        
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);

        
        if (percentage >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
public class Assignment3 {

    public static void main(String[] args) {
       
        Student s1 = new Student(101, "Om Patil", 80.25);

       
    }
}
