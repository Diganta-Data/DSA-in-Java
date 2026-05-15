package Condition_statemante;

import java.util.Scanner;

public class graph {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of x:");

        int x = sc.nextInt();
        System.out.print("enter the value of y:");
        int y = sc.nextInt();



        if (x==0 && y==0 )
            System.out.println(" origin");

        else if (x!=0 && y==0 )
            System.out.println("on x-axis");

        else if (x==0 && y!=0 )
            System.out.println("on y-axis");

        else if (x>0 && y>0 )
            System.out.println(" 1st quadrant");

        else if (x<0 && y>0 )
            System.out.println(" 2nd quadrant");

        else if (x<0 && y<0 )
            System.out.println(" 3rd quadrant");
        else
            System.out.println(" 4th quadrant");

    }

}
