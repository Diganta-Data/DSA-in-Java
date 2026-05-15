package Array;

import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n:");
         int n = sc.nextInt();

         int[] arr = new int[n];
         for(int i=0;i<=n-1;i++){
             arr[i]= sc.nextInt();
         }
         print(arr);
         Arrays.sort(arr);
         print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
