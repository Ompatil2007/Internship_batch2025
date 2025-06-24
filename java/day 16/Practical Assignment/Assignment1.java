

public class Assignment1 {
    public static void main(String[] args) {
        try{
            int num=10/0;
        }catch(Exception e){
            System.out.println("Divide by zero:"+e.getMessage());
        }
    }
}
