

public class Assignment3 {
    public static void main(String[] args) {
        try{
            int num=40/0;
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Exception is Handle");
        }
    }
}
