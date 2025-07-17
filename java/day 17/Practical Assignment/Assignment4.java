
public class Assignment4 {
     public void printDetail(){
        String str="OM";
        System.out.println(str.toLowerCase());
     }
  public static void main(String[] args) {
        try{
            Assignment4 o=null;
           o.printDetail();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  }  

