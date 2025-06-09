package Demo.java;

public class EvenNumbers {
	 public void printEvenNumbers(int n) {
		  for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EvenNumbers en = new EvenNumbers();
	        en.printEvenNumbers(10);
	}

}
