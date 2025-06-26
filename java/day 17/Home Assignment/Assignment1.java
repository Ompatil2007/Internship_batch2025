
public class Assignment1 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        try{
             for(int i=0;i<=a.length;i++){
                System.out.println(a[i]);
             }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
        }
    }
}
