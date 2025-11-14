public class friendGrouping {
    public static int group(int num){
        if(num==0||num==1){
            return 1;
        }
        int a1 = group(num-1);
        int a2 = group(num-2);
        int a2PairingWays = (num-1)*a2;
        return a1+a2PairingWays;
    }
    public static void main(String arags[]){
        int totStud = 4;
        System.out.print(group(totStud));
    }
}
