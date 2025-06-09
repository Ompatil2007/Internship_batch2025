package Demo.java;
import java.util.*;
public class Bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the num1:");
		int a=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the num2:");
		int b=sc.nextInt();
		
		System.out.println("Bitwise AND:"+(a&b));
		System.out.println("Bitwise OR:"+(a|b));
		System.out.println("Bitwise XOR:"+(a^b));
		


	}

}
