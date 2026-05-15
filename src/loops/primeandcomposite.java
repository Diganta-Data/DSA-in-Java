package loops;

import java.util.Scanner;

public class primeandcomposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        boolean flag = true;//true for prime number
        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) { // 1 for composite number
                flag = false;
                break;
            }

        }
        if(n==1) System.out.println("neither prime nor composite ");
        else if (flag == false)System.out.println("composite number");
        else System.out.println("prime  number");
    }
}
