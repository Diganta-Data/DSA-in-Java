package Condition_statemante;

import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a:");

        int a = sc.nextInt();
        System.out.print("enter the value of b:");
        int b = sc.nextInt();

        System.out.print("enter the value of c:");

        int c = sc.nextInt();



        if (a>=b)
            if(a>=c)
            System.out.println( a );
            else
                System.out.println(c);


        else
            if(b>=c)
            System.out.println( b );
            else
                System.out.println(c);

    }
}
