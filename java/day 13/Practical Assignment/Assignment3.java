import java.util.Scanner;
import static java.lang.Math.PI;

public class Assignment3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        int r = sc.nextInt();

        System.out.println("Area of Circle:"+(PI*r*r));
    }
    
}
