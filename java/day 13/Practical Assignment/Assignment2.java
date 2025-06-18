import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        System.out.println("Square Root: " + sqrt(a));
        System.out.println("Power: " + pow(a, 3));
        
    
    }
}
