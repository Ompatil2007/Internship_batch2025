package Demo.java;
import java.util.*;
public class Split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the sentence:");
		String s=sc.nextLine();
		
		
		String[] words= s.split("");
		System.out.print("word in the sentence:");
		for (String word: words) {
			System.out.println(word);
		}

	}

}
