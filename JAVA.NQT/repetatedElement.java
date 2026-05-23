import java.util.*;

public class repetatedElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();

        System.out.print("Enter the array element:");
        int[] arr = new int[n];

        for(int i =0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i =1;i<n;i++){
            if(arr[i] == arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
