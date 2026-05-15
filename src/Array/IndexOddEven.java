package Array;

import java.util.Scanner;
import java.util.Arrays;

public class IndexOddEven {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print((arr[i]+10)+" ");

            }
            if(arr[i]%2==1){
                System.out.print((arr[i]*2)+" ");
            }
        }
        System.out.println();
    }
}
