class Movie{
      String title, director;
      int releaseyear;
    public Movie (String title , String director , int releaseyear){
        this.title=title;
        this.director=director;
        this.releaseyear=releaseyear;
}
    void display(){
        System.out.println("Title:"+title);
        System.out.println("Director:"+director);
        System.out.println("Release Year:"+releaseyear);
    }
}
public class Assignment1 {
public static void main(String[] args) {
    Movie m1=new Movie("The NoteBook","Nick Cassavetes",2004);
    m1.display();
    Movie m2=new Movie("Before Sunrise","Richard Linklater",1995);
    m2.display();
}  
} 
    

