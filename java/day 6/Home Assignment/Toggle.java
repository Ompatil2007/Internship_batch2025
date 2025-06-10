package Demo.java;
import java.util.*;
public class Toggle {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();

	        int toggledNum = num ^ 1;

	        System.out.println("Original number: " + num);
	        System.out.println("After toggling last bit: " + toggledNum);
	}

}
