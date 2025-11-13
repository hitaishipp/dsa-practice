public class factorial {
    public static int fact(int num){
        int factorial =0;
        if(num==1){
            return 1;
        }
        factorial = num*fact(num-1);
        return factorial;
    }

    public static void main(String args[]){
        int num = 5;
        System.out.print(fact(num));
    }
}
