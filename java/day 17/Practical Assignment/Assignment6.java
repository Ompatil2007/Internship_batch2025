import java.io.*;
public class Assignment6 {
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("om.txt");

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
