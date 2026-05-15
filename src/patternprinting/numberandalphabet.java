package patternprinting;

import java.util.Scanner;

public class numberandalphabet {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { //kitna line hoga
            for (int j = 1; j <= i; j++) {//har line main kitna star hoga

                if (i % 2 == 1) {
                    System.out.print(j+" ");
                } else {

                    System.out.print((char) (j + 64) + " ");
                }



            }
            System.out.println();

        }
    }
}