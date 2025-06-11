package Demo.java;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Grade:");
		String w=sc.next();
		
		switch (w) {
		case "A": System.out.print("EXCELLENT");
			break;
		case "B":System.out.print("GOOD");
			break;
		case "C":
			System.out.print("AVERAGE");
			break;
		case "D":
			System.out.print("BELOW AVERAGE");
			break;
		case "F":
			System.out.print("FAIL");
			break;
		 default:
			System.out.print("Invalid!!");
			break;
	}

	}
}
