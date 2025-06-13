package Demo.java;
import java.util.*;
public class ChararterToAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Character:");
		char p=sc.next().charAt(0);
		
		int ascii=(int)p;
		System.out.print("ASCII value of "+p+" is "+ascii);
	}

}
