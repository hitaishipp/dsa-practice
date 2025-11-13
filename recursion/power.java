public class power {
    public static int power1(int num,int pow){
        if(pow==0){
            return 1;
        }
        return num*power1(num,pow-1);
    }
    public static int powerOptimised(int num,int pow){
        if(pow==0){
            return 1;
        }
        int power=powerOptimised(num,pow/2)*powerOptimised(num,pow/2); 
        if(pow%2!=0){
            power*=num;
        }
        return power;
    }
    public static void main(String args[]){
        int num = 7;
        int pow= 3;
        System.out.print(power1(num,pow));
        System.out.println();
        System.out.print(powerOptimised(num,pow));

    }
}
