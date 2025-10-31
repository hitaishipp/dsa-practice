import java.util.*;
public class subarray{
    public static void subarray(int arr[]){
        int tot=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for (int j=0;j<arr.length-i;j++){
                System.out.print(arr[j]);
            }
            System.out.print("]\n");
            tot++;
        }
        System.out.println("Total subarrays: " + tot);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         subarray(arr);
    }
}