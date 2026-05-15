package Array;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] arg){
//        int[] arr= {2,89,60,0,45,3};
//      //  System.out.println(arr.length);
//
//        int n= arr.length;
//
//        for(int i=0;i<=n-1;i++){
//            System.out.print(arr[i]+" ");
//        }
        Scanner sc = new Scanner(System.in);

        int[] arr=new int[7];

        for(int i=0;i<7;i++){//input
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            System.out.print((-arr[i])+" ");
        }
    }
}
