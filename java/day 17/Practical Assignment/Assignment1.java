
public class Assignment1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        try{
           System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
