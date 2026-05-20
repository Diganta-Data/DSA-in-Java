import java.util.Scanner;
import java.util.Arrays;

public class SecSmallAndSecLarg {
    public static void main(String[] args){
        System.out.println("Enter the size of Arrays:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        getElements(arr,n);
    }

    public static void getElements(int[]arr, int n){

        if(n==0 || n==1){
            System.out.print("-1"+" "+"-1");
            return;
        }

        Arrays.sort(arr);

        int Secsmallest = arr[1];
        int Seclargest = arr[n-2];

        System.out.println("The Second smallest element is:"+ Secsmallest);
        System.out.println("The Second largest element is:"+ Seclargest);
    }
    
}
