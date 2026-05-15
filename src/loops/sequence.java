package loops;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            if (i != n - i + 1) {   // prevents duplicate in the middle
                System.out.println(n - i + 1);
            }
        }
    }
}
