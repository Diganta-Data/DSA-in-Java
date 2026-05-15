package Condition_statemante;

import java.util.Scanner;

public class triangleside {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st side value of triangle:");

        int n1 = sc.nextInt();
        System.out.print("enter the 2nd side value of triangle:");
        int n2 = sc.nextInt();
        System.out.print("enter the 3rd side value of triangle:");
        int n3 = sc.nextInt();


        if (n1+n2>n3 && n2+n3>n1 && n3+n1>n2 )
            System.out.println(" is sides of the triangle ");

        else
            System.out.println("is not sides of the triangle");

    }
}
