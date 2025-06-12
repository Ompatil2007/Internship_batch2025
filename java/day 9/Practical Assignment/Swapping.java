package Demo.java;

public class Swapping {

	public static void main(String[] args) {
		int a=10,b=50;
		System.out.println("Before Swapping:");
		System.out.println("A:"+a+"B:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:");
		System.out.println("A:"+a+"B:"+b);

	}

}
