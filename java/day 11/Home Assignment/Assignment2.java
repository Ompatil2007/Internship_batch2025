class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}
    class Assignment2{
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 799.00);
        Product p2 = new Product("Mouse", 499.00);
        Product p3 = new Product("Monitor", 8999.00);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
