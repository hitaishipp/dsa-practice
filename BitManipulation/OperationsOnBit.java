public class OperationsOnBit {
    public static int getBit(int n,int a){
        int bitMask= 1<<a;
        return (n&bitMask);
    }
    public static int setBit(int n,int a){
        int bitMask= 1<<a;
        return n|bitMask;
    }
    public static int clearBit(int n,int a){
        int bitMask=~(1<<a);
        return n&bitMask;
    }
    public static int updateBit(int n,int a,int ch){
        if(ch==0){
            return clearBit(n,a);
        }
        else{
           return setBit(n,a);
        }
    }
    public static int clearLastNBits(int n,int a){
        int bitMask=(~(0)<<a);
        return n&bitMask;
    }
    public static int clearBitsInRange(int n,int i,int j){
        int b=((~0)<<(j+1));
        int c=(1<<i)-1;
        int bitMask=b|c;
        return n&bitMask;
    }
    public static void main(String args[]){
        int n = 0b100101010;
        int a =6;
        int i=3;
        int j=6;
        System.out.println(getBit(n,a));
        System.out.println(setBit(n,a));
        System.out.println(clearBit(n,a));
        System.out.println(updateBit(n,a,1));
        System.out.println(clearLastNBits(n,a));
        System.out.println(clearBitsInRange(n,i,j));

    }
    
}
