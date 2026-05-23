import java.util.*;

public class ReElSoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array element:");

        for(int i =0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(arr[0]+" ");

        for(int i =1;i<n;i++){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
