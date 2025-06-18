class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }
}

class Assignment1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add(int, int): " + calc.add(10, 20));
        System.out.println("Add(int, int, int): " + calc.add(5, 10, 15));
        System.out.println("Add(double, double): " + calc.add(2.5, 3.5));
        System.out.println("Add(int, double): " + calc.add(10, 3.14));
        System.out.println("Add(double, int): " + calc.add(4.5, 2));
    }
}
