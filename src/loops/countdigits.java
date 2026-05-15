package loops;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //if(n==0) n=7;
        int count=0;
        while(n!=0){
            n/=10;
            count++;




        }
        System.out.println(count);
    }
}
