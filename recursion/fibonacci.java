//fibonacci number - 0 1 1 2 3 5 8 13 . . .

public class fibonacci {
    public static int fibo(int num){ 

        if(num==1||num==2){
            return num-1;
        }
        return fibo(num-1)+fibo(num-2);
    }

    public static void main(String args[]){
        int num = 7;
        System.out.print(fibo(num));
    }
}
