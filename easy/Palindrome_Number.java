public class Palindrome_Number {
    
public static boolean isPalindrome(int x) {
        int num = 0;
        int temp = x;
        if(x<0) {
            return false;
        }
        while (x != 0) {
           num = num*10 + x%10;
           x/=10;
        }
        if(num == temp) {
            return true;
        }
        return false;
}
    public static void main(String[] args) {
        isPalindrome(121);
        
    }
}
