public class Palindrome {
    public static boolean rev(String s) {
        int i = 0;
        while (i < s.length() / 2) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "aabbba";
        System.out.print(rev(s));
    }
}
