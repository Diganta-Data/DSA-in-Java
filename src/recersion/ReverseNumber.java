package recersion;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        int num=12345;
        int result=reverse(num,0);
        System.out.println("reverse number is:"+result);
    }
    public static int reverse(int n ,int rev){
        if(n==0){
            return rev;
        }

        int digit = n % 10;
        rev=rev*10+digit;
        return reverse(n/10,rev);
    }

}
