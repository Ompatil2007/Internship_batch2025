// Create a Shape base class. Derive Circle and Rectangle classes from it. Each subclass should have its own method to calculate and print area.
class Shape{
int len=20,bre=10,r=6;
} 
class Circle extends Shape{
    float calculate;
void calculate(){
     calculate=3.14f*r*r;
}
void display(){
    System.out.println("Area of circle:"+calculate);
}
}
class Rectangle extends Shape{
    int Area;
    void calculate1(){
         Area=len*bre;
    }
    void display2(){
        System.out.println("Area of Rectangle:"+Area);
    }

}
public class Assignment3 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculate();
        c.display();
        Rectangle r=new Rectangle();
        r.calculate1();;
        r.display2();
        
    }
    
}
