public class Power {
    public static void pow(int num,int pow){
        int ans=1;
        while(pow>0){
            if((pow&1)!=0){
                ans*=num;
            }
            num*=num;
            pow=pow>>1;
            
        }
        System.out.print(ans);
    }
    public static void main(String args[]){
        pow(3,15);
    }
}
