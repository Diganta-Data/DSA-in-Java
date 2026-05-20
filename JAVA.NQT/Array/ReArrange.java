import java.util.*;

public class ReArrange {
    public static void main( String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
       
        int n = sc.nextInt();

        int[] arr = new int[n];
         System.out.println("Enter array elements:");
        for(int i =0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        
        rearrang(arr,n);


    }

    public static void rearrang(int[]arr, int n){

        Arrays.sort(arr);

        int mid = (n+1)/2;

        for(int i =0; i<mid;i++){
            System.out.print(arr[i]+" ");
        } 

        for(int i = n-1; i>=mid;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
