public class Assignment1{
    int id;
    String name;
    int salary;
    Assignment1(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }


    public static void main(String[] args) {
        Assignment1 e=new Assignment1(18, "OM PATIL", 100000);
    }
} 

