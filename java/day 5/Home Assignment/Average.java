package Demo.java;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the num1");
		double num1=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the num2");
		double num2=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the num3");
		double num3=sc.nextInt();
		sc.nextLine();
		
		double average=(num1+num2+num3)/3;
		
		System.out.print("Average of num:"+average);
	}

}
