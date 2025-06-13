package Demo.java;
import java.util.*;
public class FactorialLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of itrations:");
		int p=sc.nextInt();
		
		for(int i=1;i<=p;i++) {
			int factorial=1;
			for(int j=1;j<=1;j++) {
				factorial*=j;
			}
			System.out.println("Factorial of"+i+"is"+factorial);
		}
	}

}
