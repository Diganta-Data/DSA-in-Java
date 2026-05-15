package Condition_statemante;
import java.util.Scanner;
public class absolutenumber {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");

        int n = sc.nextInt();

        if(n>=0)
            System.out.println(n);
        else System.out.println(-n);
    }
}
