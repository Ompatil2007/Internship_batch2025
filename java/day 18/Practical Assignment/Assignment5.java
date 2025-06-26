public class Assignment5 {
    static int count = 0; 
    Assignment5() {
        count++; 
        System.out.println("Object Created: " + count);
    }

    public static void main(String[] args) {
        Assignment5 a1 = new Assignment5();
        Assignment5 a2 = new Assignment5();
        Assignment5 a3 = new Assignment5();
    }
}
