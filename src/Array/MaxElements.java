package Array;

import java.util.Scanner;

public class MaxElements {
    public static void main(String[] arg){
        System.out.print("ENTER THR SIZE OF THE ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] =sc.nextInt();
        }
        int max= arr[0];

        for(int i=0;i<=n-1;i++){
            if(arr[i]>max)
                max=arr[i];






         }
        System.out.println(max);

    }
}
