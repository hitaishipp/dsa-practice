public class BinaryWithoutConsecutiveOne {
    public static void convert(int num,int lastPlace,String str){
        if(num==0){
            System.out.println(str);
            return;
        }
        convert(num-1,0,str+"0");
        if(lastPlace==0){
            convert(num-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        int num = 4;
        convert(num,0,"");
    }
    
}
