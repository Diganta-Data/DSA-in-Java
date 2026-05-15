package loops;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");

        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        //if(n==0) n=7;
        int power=1;
        for(int i =1; i<=b;i++){
            power*=a;
            //System.out.println(fact);




        }
        System.out.println(power);
    }
}
