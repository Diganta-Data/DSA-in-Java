package Condition_statemante;
import java.util.Scanner;
public class fourdigitenumber {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");


        int n = sc.nextInt();

        if (n>999 && n<10000)
            System.out.println("4 digit number ");

        else
            System.out.println("not a 4 digit number");

    }
}
