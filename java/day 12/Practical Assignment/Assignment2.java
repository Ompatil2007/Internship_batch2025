class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
    void display(){
        System.out.println("Area of circle:"+area());
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
        void display1(){
        System.out.println("Area of Rectangle:"+area());
    }
}
class Assignment2{
    public static void main(String[] args) {
        Circle c=new Circle(7);
        c.display();
        Rectangle r=new Rectangle(10, 20);
        r.display1();

            
        }
    }
