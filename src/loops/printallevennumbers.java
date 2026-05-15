package loops;

import java.util.Scanner;

public class printallevennumbers {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");

        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
                // System.out.print(i+" ");
            }
        }
    }
}
