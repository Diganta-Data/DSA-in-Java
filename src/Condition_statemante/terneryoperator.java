package Condition_statemante;

import java.util.Scanner;

public class terneryoperator {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");


        int n = sc.nextInt();

        // condition ? true : false
        System.out.println((n%2==0)  ? "Even" : "Odd");
    }
}
