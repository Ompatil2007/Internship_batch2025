class Product {
    private int productId;
    private String name;
    private double price;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            System.out.println("Invalid price");
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    void display() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: ₹" + getPrice());
    }
}

class Assignment3 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(101);
        p.setName("Smartphone");
        p.setPrice(15999.99);
        p.display();
    }
}
