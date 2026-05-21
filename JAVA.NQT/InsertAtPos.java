import java.util.Scanner;

public class InsertAtPos {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the the array:");
        int n = sc.nextInt();


        System.out.print("Enter the array element: ");
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){ 
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of x:");
        int x = sc.nextInt();

        System.out.print("Enter the pos:");
        int pos = sc.nextInt();

        int[] result = new int[n+1];

        

        for(int i =0;i<pos-1;i++){
            result[i]=arr[i];
        }

        result[pos-1]=x;

        for(int i =pos-1;i<n;i++){
            result[i+1]=arr[i];
        }

        for(int i =0;i<n+1;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
