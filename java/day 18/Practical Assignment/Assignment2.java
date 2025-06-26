public class Assignment2{
    int id;
    String name;
    int salary;
    Assignment2(){
        System.out.println("Hello From Om!!");
    }
    Assignment2(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }


    public static void main(String[] args) {
        Assignment2 a=new Assignment2();
        Assignment2 e=new Assignment2(18, "OM PATIL", 100000);
    }
} 

