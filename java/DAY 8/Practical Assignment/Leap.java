package Demo.java;
import java.util.*;
public class Leap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year:");
		
		int a=sc.nextInt();
		
		if(a%4==0){
			System.out.print("Leap Year:");
		}else{
			System.out.print("Normal year:");
			
		}
	}

}
