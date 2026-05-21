import java.util.Scanner;

public class InsertInEnd {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the the array:");
        int n = sc.nextInt();


        System.out.print("Enter the array element: ");
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){ 
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of x:");
        int x = sc.nextInt();

        int[] result = new int[n+1];

        result[n]=x;

        for(int i =0;i<n;i++){
            result[i]=arr[i];
        }

        for(int i =0;i<n+1;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
