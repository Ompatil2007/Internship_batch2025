package Demo.java;
import java.util.*;
public class Citizen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Age:");
		int age=sc.nextInt();
		
		if(age==60||age>60) {
			System.out.print("Senior citizen:");
		}else if(age>=18||age<60){
			System.out.print("Adult");
		}else {
			System.out.print("Child:");
		
			
		}
	}

}
