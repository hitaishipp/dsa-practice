import java.util.*;
public class FindAllAnagrams {
    public static List<Integer> allAnagrams(String s,String p){
        List<Integer> answer= new ArrayList<>();
        if(p.length()>s.length()){
            return answer;
        }
        int countS[] = new int[26];
        int countP[] = new int[26];

        int windowSize = p.length();
        for(int i =0;i<p.length();i++){
            countP[p.charAt(i)-'a']++;
        }
        for(int i = 0; i<s.length();i++){

            countS[s.charAt(i)-'a']++;

            if(i>=windowSize){
               countS[s.charAt(i-windowSize)-'a']--; 
            }

            if (Arrays.equals(countS, countP)) {
                answer.add(i - windowSize + 1);
            }
        
        }
        return answer;
    }
    public static void main(String args[]){
        String s = "hihihihihelo";
        String p = "helo";
        List<Integer> result = allAnagrams(s, p);
        System.out.println(result);
    }
}
