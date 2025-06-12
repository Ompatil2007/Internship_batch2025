package Demo.java;
import java.util.*;
public class Currency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter the currency code (INR, USD, EUR, GBP): ");
	        String s = sc.nextLine().toUpperCase();

	        switch (s) {
	            case "INR":
	                System.out.print("₹");
	                break;
	            case "USD":
	                System.out.print("$");
	                break;
	            case "EUR":
	                System.out.print("€");
	                break;
	            case "GBP":
	                System.out.print("£");
	                break;
	            default:
	                System.out.print("Invalid currency");
	                break;
		}
	}

}
