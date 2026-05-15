package basic_java;

import java.util.Scanner;

public class inputsquarenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");

        int n =sc.nextInt();
        int square ;
        square=(n*n);
        System.out.println("the square number is:");
        System.out.println(square);


    }

    }