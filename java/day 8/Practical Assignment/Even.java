package Demo.java;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.print("Even Number");
		}else {
			System.out.print("Odd");
		}
	}

}
