package medium;
import java.lang.Math;
public class Reverse_Integer {
    public static int reverse(int x) {
        int rever = 0;
        long check = 0;
        while (x!=0) {
            rever = rever*10 + x%10;
            check = check*10 + x%10; // phải check ở đây nếu rever vượt quá giới hạn int nó sẽ render ra 1 giá trị rác k thể so sánh đk int đc
            x/=10;
        }
        if(rever != check) {
            return 0;
        }
        return rever;
    }   
   
    
}
