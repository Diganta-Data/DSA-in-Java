package loops;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //if(n==0) n=7;
        int r=0;
        while(n!=0){
            r*=10;
            r+=n%10;
            n/=10;








        }
        System.out.println(r);
    }
}
