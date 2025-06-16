class Employee{
     String Name="OM PATIL";
      long id=2310101;
        void displayInfo(){
            System.out.println("Name:"+Name);
            System.out.println("Id:"+id);
        }
}
class Assignment3{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.displayInfo();
    }
}