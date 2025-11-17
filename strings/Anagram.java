public class Anagram {
     public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int i=0;
        int count[] = new int[26];
        while(i<s.length()){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
            i++;
        }
        for(int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.print(isAnagram(s,t));

    }
    
}
