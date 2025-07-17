
public class Assignment2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        try{
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }    

