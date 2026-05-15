package loops;

import java.util.Scanner;

public class sumofnumberanditsrevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        int num =0;
//        while(n!=0){
//            num+=n%10;
//            n/=10;
//        }
        //System.out.println(num);
        //if(n==0) n=7;
        int original=n;
        int r=0;
        while(n!=0){
            r*=10;
            r+=n%10;
            n/=10;








        }
        System.out.println(r);


        int sum = original +r;
        System.out.println(sum);

        }
    }

