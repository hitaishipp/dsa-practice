public class stringCompression{
    public static void compression(String str){
        StringBuilder strNew = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                
                strNew.append(str.charAt(i - 1));

                if (count > 1) {
                    strNew.append(count);
                }
                count = 1;
            }
        }

        System.out.println(strNew.toString());
    }
    public static void main(String args[]){
        String str="aaabbbccdde";
        compression(str);
    }
}