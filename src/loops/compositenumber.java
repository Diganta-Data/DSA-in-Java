package loops;

import java.util.Scanner;

public class compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                System.out.println("composite number");
            break;
            }

        }
    }
}
