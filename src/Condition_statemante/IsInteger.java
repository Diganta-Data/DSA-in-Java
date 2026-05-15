package Condition_statemante;
import java.util.Scanner;
public class IsInteger {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");

        double n= sc.nextDouble();
        int x = (int)n;

        if(n-x==0)
            System.out.println("number is integer");
        else
            System.out.println("number is not integer");
    }
}
