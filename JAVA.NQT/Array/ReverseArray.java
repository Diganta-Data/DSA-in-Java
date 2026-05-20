import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        System.out.print("Enter the size of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int i =0; int j = n-1;

        while(i<j){
             
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    
}
