public class TilingProblem {
    public static int tiling(int num){
        if(num==0||num==1){
            return 1;
        }
        int a1 = tiling(num-1);
        int a2 = tiling(num-2);
        int totalWays = a1 + a2;
        return totalWays;
        
    }
    public static void main(String args[]){
    int num = 7;
    System.out.print(tiling(num));
    
    }
}
