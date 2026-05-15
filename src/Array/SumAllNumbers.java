package Array;

import java.util.Scanner;

public class SumAllNumbers {
    public static void main(String[] arg){
        System.out.print("ENTER THR SIZE OF THE ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] =sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum += arr[i];



        }
        System.out.println(sum);

    }
}
