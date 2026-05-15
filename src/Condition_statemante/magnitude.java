package Condition_statemante;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");


        int n = sc.nextInt();
        int magnitude = Math.abs(n);

        if (magnitude<69)
            System.out.println("magnitude is smaller then 69 ");

        else
            System.out.println("magnitude is not smaller then 69");

    }
}
