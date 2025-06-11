package Demo.java;
import java.util.*;
public class Vovels {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Alphabet:");
		String w=sc.next();
		
		switch (w) {
		case "a": 
			System.out.print("a");
			break;
		case "e":
			System.out.print("e");
			break;
		case "i":
			System.out.print("i");
			break;
		case "o":
			System.out.print("o");
			break;
		case "u":
			System.out.print("u");
			break;
		 default:
			System.out.print("Invalid!!");
			break;
		}
	}

}
