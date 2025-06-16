class Mobile{
      String mobilename;
        double price;
        public Mobile(String mobilename,double price){
            this.mobilename=mobilename;
            this.price=price;
        }
        void display(){
            System.out.println("Mobile Name:"+mobilename);
            System.out.println("Pen Color:"+price);
        }
}

public class Assignment2 {
    public static void main(String[] args) {
        Mobile m=new Mobile("Vivo",45000);
        m.display();
        Mobile m1=new Mobile("Samsung",45000);
        m1.display();
    }
}
