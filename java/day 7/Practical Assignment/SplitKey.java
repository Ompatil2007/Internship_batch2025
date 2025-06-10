package Demo.java;
import java.util.*;
public class SplitKey {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="101,Ravi,78,85,90";
		String []word=s.split(",");
		
		for(String words:word) {
			System.out.println(words);
		}
	}

}
