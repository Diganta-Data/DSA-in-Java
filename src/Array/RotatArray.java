package Array;
import java.util.Scanner;
public class RotatArray {
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);

        System.out.print("Enter the size of n:");
        int n= sc.nextInt();
        System.out.print("Enter the size of d:");
        int d= sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter thr arry elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
            d= d % n;// normalize rotation

            //rotate using reverse method
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);

            System.out.print("Rotate arry:");
            for(int val : arr){
                System.out.print(val+" ");
            }
        }

    public static void reverse(int[] arr, int i, int j){
        while(i<j){
           int temp= arr[i];
           arr[i]=arr[j];
           arr[j]=temp;

           i++;
           j--;
        }
    }
}
