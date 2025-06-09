package Demo.java;

public class StringNum {

	public static void main(String[] args) {
		String str="OM";
		System.out.println("Original String:"+str);
		
		System.out.println("Numeric values:");
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int ascii=(int)ch;
			System.out.println(ch+":"+ascii);
		}
	
	}

}
