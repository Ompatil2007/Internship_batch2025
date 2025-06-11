package Demo.java;

public class Split3 {

	public static void main(String[] args) {
		String s="Hello!How are you!Good!";
		
		String[] words=s.split("!");
		
		System.out.println("word in the sentence:");
		for (String word: words) {
			System.out.println(word);
		}
	}

}
