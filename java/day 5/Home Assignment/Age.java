package Demo.java;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.print("You are elligible for vote:");
		}else {
			System.out.print("You are not elligible for vote:");
		}


	}

}
