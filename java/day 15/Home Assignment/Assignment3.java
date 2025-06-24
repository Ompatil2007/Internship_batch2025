public class Assignment3 {

    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        do{
            int digit=num%10;
            sum+=digit;
            num/=10;

        }while(num!=0);
        System.out.println("Sum of digiys is:"+sum);
    }
}