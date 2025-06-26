public class Assignment4 {

    // Static method to calculate square
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // Call static method directly using class name (no object needed)
        int result = Assignment4.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
