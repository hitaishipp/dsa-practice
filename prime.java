import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int flag=0;
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }
        
        for(int i=2;i<=Math.sqrt(num)&&flag==0;i++){
            if(num%i==0){
                flag=1;
            }
         
        }
        if(flag==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}