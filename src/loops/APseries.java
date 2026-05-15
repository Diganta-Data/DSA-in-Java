package loops;

import java.util.Scanner;

public class APseries {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a=99, d=-4;
//        for( i=99; i>=1; i=i-4){
//            System.out.print(i+" ");
//        }
        for(i=n; i>=1; i=i-4){
            System.out.print(i+" ");
            a-=d;
        }
    }
}
