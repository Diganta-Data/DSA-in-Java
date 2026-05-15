package Condition_statemante;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");


        int n = sc.nextInt();

            if (n%2 == 0)
                System.out.println("even number");

            else
                System.out.println("odd number");

    }
}
