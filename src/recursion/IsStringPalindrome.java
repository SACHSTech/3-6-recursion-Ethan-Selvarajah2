package recursion;

public class IsStringPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }

        return isPalindrome(s.substring(1, s.length()-1));

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("cbaabc"));
        System.out.println(isPalindrome("abc"));
    }
}
