//. Create a User base class with username and email, and a subclass Admin that adds adminLevel. Use constructor chaining and print details of the Admin.
class User{
String UserName,email;
public User(String UserName,String email){
    this.UserName=UserName;
    this.email=email;
}
} 
class Admin extends User{
    String AdminLevel;
    public Admin(String UserName,String email,String AdminLevel){
        super(UserName,email);
        this.AdminLevel=AdminLevel;
    }
    void display(){
        System.out.println("UserName:"+UserName);
        System.out.println("Email"+email);
        System.out.println("AdminLevel"+AdminLevel);
    }

}
class Assignment2{
    public static void main(String [] args){
        Admin a=new Admin("Om985526","Patilom2007","level123");
        a.display();

    }
}