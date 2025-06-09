package Demo.java;
import java.util.*;
public class Logical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Marks:");
		int marks=sc.nextInt();
		sc.nextLine();
		
		if((marks>40)||(marks==40)){
			System.out.print("Sudent is passed!");
		}else {
			System.out.print("Student is Failed");
		}

	}

}
	