class Assignment1 {
    String brand;
    double price;

    // Constructor
    public Assignment1(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop Price: ₹" + price);
    }

    public static void main(String[] args) {
        Assignment1 l1 = new Assignment1("Dell", 55000.00);
        l1.displayDetails(); // Call method
    }
}
