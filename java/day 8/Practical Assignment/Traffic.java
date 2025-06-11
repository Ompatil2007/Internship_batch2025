package Demo.java;
import java.util.*;
public class Traffic {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Color:");
		String w=sc.next();
		
		switch (w) {
		case "Red": System.out.print("STOP");
			break;
		case "Green":System.out.print("READY");
			break;
		case "Yellow":System.out.print("GO");
		
		 default:
			System.out.print("Invalid!!");
			break;
	}

}
}