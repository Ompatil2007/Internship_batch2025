package Demo.java;

public class Book {
String title,author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;}
		void display() {
			System.out.println("title:"+title);
			System.out.println("author:"+author);
		}
			
		
	

	public static void main(String[] args) {
		Book b=new Book("Shyam vhi aai","Om patil");
		Book b1=new Book("Balbharati","Ritesh Patil");
		b.display();
		b1.display();
		
	}

}
