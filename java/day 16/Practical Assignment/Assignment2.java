import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();

        try{
            int divide=num1/num2;
        }catch(Exception e){
            System.out.println("Exception "+e.getMessage());
        }
    }
}
