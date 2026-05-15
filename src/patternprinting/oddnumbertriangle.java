package patternprinting;

import java.util.Scanner;

public class oddnumbertriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { //kitna line hoga
            int odd= 1;
            for (int j = 1; j <= i; j++) { //har line main kitna star hoga

                // if ((i + j) % 2 == 1) {
                System.out.print(odd + " ");
                odd = odd+2;
            }


            System.out.println();
        }

    }

}
