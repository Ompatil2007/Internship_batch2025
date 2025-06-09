package Demo.java;
import java.util.*;
public class Relational {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the num1:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the num2:");
		int b=sc.nextInt();
		sc.nextLine();
		
		System.out.println("a==b"+(a==b));
		System.out.println("a!=b"+(a!=b));
		System.out.println("a<b"+(a<b));
		System.out.println("a>b"+(a>b));
		System.out.println("a<=b"+(a<=b));
		System.out.print("a>=b"+(a>=b));
		
		

	}

}
