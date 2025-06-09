package Demo.java;
import java.util.*;
public class Shift {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the num1:");
		int a=sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("Left shift:"+(a<<2));
		System.out.println("Right shift:"+(a>>2));
		System.out.println("Unsigned shift:"+(a>>>2));
	}

}
