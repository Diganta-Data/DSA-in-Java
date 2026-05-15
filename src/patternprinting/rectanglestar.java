package patternprinting;

import java.util.Scanner;

public class rectanglestar {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { //kitna line hoga
            for (int j = 1; j <= n; j++) { //har line main kitna star hoga
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* "+" ");
                } else {

                    System.out.print("   ");
                }


            }
            System.out.println();

        }
    }
}