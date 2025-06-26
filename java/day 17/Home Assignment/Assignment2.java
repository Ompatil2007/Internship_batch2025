public class Assignment2 {
    public String s = null;

    void print() {
       
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args) {
        Assignment2 obj = new Assignment2();

        try {
            obj.print();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
