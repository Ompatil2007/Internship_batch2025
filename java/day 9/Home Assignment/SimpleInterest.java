package Demo.java;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Principle:");
		float p=sc.nextInt();
		System.out.print("Enter rate of Interest::");
		float r=sc.nextInt();
		System.out.print("Enter Time in years:");
		float t=sc.nextInt();
		
		System.out.print("Simple Interst:"+((p*r*t)/100));
		
		
	}

}
