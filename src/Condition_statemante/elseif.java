package Condition_statemante;

import java.util.Scanner;

public class elseif {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st side value of triangle:");

        int n = sc.nextInt();



        if (n%5==0 )
            System.out.println(" riya ");
        else if (n%3==0 ) {
            System.out.println(" bonu ");
        }
        else if (n%5==0 && n%3==0 )
            System.out.println(" digha ");



        else
            System.out.println("isha");

    }
}
