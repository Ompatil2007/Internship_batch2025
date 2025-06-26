import java.io.*;

public class Assignment3 {
    public static void main(String[] args) {
        try {
            // Trying to read from a file that doesn't exist
            FileReader file = new FileReader("nonexistentfile.txt");

            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }

            file.close();
        } catch (IOException e) {
            // Handle the exception
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
 
