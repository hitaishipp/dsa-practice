public class PrintInIncDecOrder{
    public static void decOrder(int num){
        if(num==1){
            System.out.print(1);
            return;
        }
        System.out.print(num);
        decOrder(num-1);
    }
    public static void incOrder(int num){
        
        if(num==1){
            System.out.print(1);
            return;
        }
        incOrder(num-1);
        System.out.print(num);
    }
    public static void main(String args[]){
        int num = 9;
        incOrder(num);
        System.out.println();
        decOrder(num);
    }
}