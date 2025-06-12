package Demo.java;

public class BitwiseSwap {

	public static void main(String[] args) {
		int a=10,b=40;
		System.out.println("Before swapping:");
		System.out.println("A:"+a+"B"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping:");
		System.out.println("A:"+a+"B:"+b);
	}

}
