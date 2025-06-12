package Demo.java;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int a =sc.nextInt();
		
		if(a%5==0&&a%11==0) {
		System.out.print("Number is Divisible by 5 and 11");
		}else {
			System.out.print("Number is not Divisible by 5 and 11");
			
		}
		

	}

}
