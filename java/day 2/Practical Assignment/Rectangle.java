package Demo.java;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length:");
		int len=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the length:");
		int bre=sc.nextInt();
		
		int Area=len*bre;
		
		System.out.print("Area:"+Area);
	}

}
