package patternprinting;

import java.util.Scanner;

public class Xpattern {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();




        for (int i = 1; i <= n; i++) { //kitna line hoga
            for (int j = 1; j <= n; j++) { //har line main kitna star hoga
                if (j==i || j==n-i+1) {
                    System.out.print("* ");
                } else {

                    System.out.print("  ");
                }


            }
            System.out.println();

        }
    }
}
