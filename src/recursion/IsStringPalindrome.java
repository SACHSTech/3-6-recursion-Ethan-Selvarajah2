package recursion;

public class IsStringPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("cbaabc"));
        System.out.println(isPalindrome("abc"));
    }
}
