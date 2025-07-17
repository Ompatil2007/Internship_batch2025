import java.io.*;

public class Assignment5 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("om.txt");
        int ch;
        while ((ch = f.read()) != -1) {
            System.out.print((char) ch);
        }
        f.close();
    }
}
