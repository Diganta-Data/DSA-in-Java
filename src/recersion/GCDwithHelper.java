package recersion;

import java.util.Scanner;

public class GCDwithHelper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Entr the value of b:");
        int b=sc.nextInt();

        int result = helper(Math.min(a,b),Math.max(a,b));
        System.out.println("GCD is:"+result);
    }
    public static int helper(int a, int b){
        if(a==0) return b;
        return helper(b%a,a);
    }
}
