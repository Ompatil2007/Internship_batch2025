package Demo.java;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number a:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the numbr for b:");
		int b=sc.nextInt();
		
		
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(b/a));
		System.out.println("Modulation:"+(a%b));
	

	}

}
