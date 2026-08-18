
import java.util.*;

public class equilibriumsum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");

        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result = pivotIdx(arr);
        System.out.print("The Equilibrium index is:" + result);
    }
    public static int pivotIdx(int[] arr){

        int totalsum =0;
        for(int num : arr){
            totalsum += num;
        }
        int leftsum = 0;
        for(int i=0;i<arr.length;i++){

            int rightsum= totalsum - leftsum - arr[i];

            if(leftsum==rightsum){
                return i;
            }
            leftsum += arr[i];
        }
        return -1;

    }
    
}
