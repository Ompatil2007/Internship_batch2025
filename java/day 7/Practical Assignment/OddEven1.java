package Demo.java;
import java.util.*;
public class OddEven1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if(num==0) {
			System.out.print("The number is Zero:");
		}else if(num%2==0){
			System.out.print("The number is Even:");
		}else {
			System.out.print("The number is Odd:");
		}
			
	}

}
