import java.util.*;

public class median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.out.print("Enter the array element:");
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("the median value is:");
        medianArray(arr,n);
        
    }
    public static void medianArray(int[] arr, int n){

        Arrays.sort(arr);

        if(n%2==0){
            int idx1=(n/2)-1;
            int idx2=(n/2);
            System.out.println((double) (arr[idx1]+arr[idx2])/2);
        }else{
            System.out.println(arr[n/2]);
        }


    }
    
}
