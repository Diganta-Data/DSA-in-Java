package Array;
import java.util.Scanner;
public class MinElements {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0; i<=n-1;i++){
            arr[i]= sc.nextInt();

        }
        int min=0;
        for( int i=0;i<=n-1;i++){
            if(arr[i]<min){
                min =arr[i];
            }

        }
        System.out.println(min);

    }
}
