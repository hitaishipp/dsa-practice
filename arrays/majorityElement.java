public class majorityElement {             //Moore's voting algorithm
    public static int majorEle(int arr[]){
        int count=0;
        int candidate=0;
        for(int num:arr){
            if(count==0){
                 candidate = num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,2,2,2,2};
        System.out.print(majorEle(arr)); 
    }
}
