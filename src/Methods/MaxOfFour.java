package Methods;

import java.util.Scanner;

public class MaxOfFour {

    public static void main(String[] arg){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the 1st number:");
            int a= sc.nextInt();
            System.out.print("Enter the 2nd number:");
            int b= sc.nextInt();
            System.out.print("Enter the 3rd number:");
            int c= sc.nextInt();
            System.out.print("Enter the 4th number:");
            int d= sc.nextInt();

            int max= Math.max(Math.max(a,b),Math.max(c,d));
            System.out.println("Maximum number is:"+ max);
        }
    }


