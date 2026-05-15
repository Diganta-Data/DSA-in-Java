package patternprinting;

import java.util.Scanner;

public class alphabettwo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i + j > n)
                    System.out.print((char)(i+64)+" " );
                else
                    System.out.print("  ");



            }
            System.out.println();

        }
    }

}
