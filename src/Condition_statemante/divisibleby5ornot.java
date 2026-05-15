package Condition_statemante;
import java.util.Scanner;
public class divisibleby5ornot {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println("number is divisible by 5");
            System.out.println("good morning digha daa");

        } else {
            System.out.println("number is not divisible by 5");
            System.out.println("good night");
        }


    }
}