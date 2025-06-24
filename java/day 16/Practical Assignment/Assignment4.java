
public class Assignment4 {
    public static void main(String[] args) {
        try{
           int a=4,b=5,c=0;
           System.out.println("Addition:"+(a+b));
           System.out.println("Subtraction"+(a-b));
           System.out.println("Division:"+(a/b)); 
           System.out.println("Divide:"+(a/c));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }catch(Exception r){
            System.out.println(r.getMessage());
        }
        finally{
            System.out.println("Operation performed Successfull!!");
        }
    }
}
