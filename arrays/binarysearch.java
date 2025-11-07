import java.util.*;
public class binarysearch {
    public static int search(int[] nums, int target) {
       int start=0,end= nums.length-1;
      
       while((start<=end)){
        int mid=(start+end)/2;
        if(nums[mid]==target){ 
            System.out.println("Element found at index: " + mid);
            return 1;
         }
        else if(nums[mid]<target){
            start=mid+1;
         }
        else{
            end=mid-1;
         }
       }
       System.out.println("Element not found");
       return -1;
    }
    public static void main(String args[]){
       System.out.println("Enter the size of array");
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Enter the elements of array");
       int nums[]= new int[n]; 
       for(int i=0;i<n;i++){
          nums[i]= sc.nextInt();
       }
       System.out.println("enter the element you want to search");
       int tar = sc.nextInt();
       search(nums,tar);
    }
}