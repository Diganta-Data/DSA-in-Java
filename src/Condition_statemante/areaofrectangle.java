package Condition_statemante;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of length:");

        int l= sc.nextInt();
        System.out.print("enter the value of breadth:");
        int b = sc.nextInt();

        int area = (b*l);
        int perimeter= 2*(b+l);


        if (area>perimeter )
            System.out.println(" area is grater then perimeter");

        else
            System.out.println("rea is not grater then perimeter");

    }
}
