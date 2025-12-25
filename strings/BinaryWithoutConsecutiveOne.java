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
    public static void noConsOne(int num, int lastbit, StringBuilder s) {//with stringbuilder
        if (num == 0) {
            System.out.println(s);
            return;
        }

        // Add '0'
        s.append('0');
        noConsOne(num - 1, 0, s);
        s.deleteCharAt(s.length() - 1); // backtrack

        // Add '1' only if last bit was 0
        if (lastbit == 0) {
            s.append('1');
            noConsOne(num - 1, 1, s);
            s.deleteCharAt(s.length() - 1); // backtrack
        }
    }
    public static void main(String args[]){
        int num = 4;
        convert(num,0,"");
    }
    
}
