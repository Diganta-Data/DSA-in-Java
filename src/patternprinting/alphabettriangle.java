package patternprinting;

import java.util.Scanner;

public class alphabettriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { //kitna line hoga
            for (int j = 1; j <= i; j++) { //har line main kitna star hoga

                System.out.print((char)(i+64) + " ");
            }


            System.out.println();
        }

    }
}
