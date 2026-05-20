import java.util.*;

public class rottedArray {
    public static void main(String[] args){
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the rotation value:");
        int d = sc.nextInt();

        int[] leftarr = arr.clone();
        leftrotte(leftarr,d);

        System.out.print("the leftrotte array is:");
        for(int num : leftarr){
            System.out.print(num+" ");
        }
        System.out.println();

        int[] rightarr =arr.clone();
        rightrotte(rightarr,d);

        System.out.print("The rightrotte array is:");
        for(int val :rightarr ){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void leftrotte(int[] arr, int d){

        int n =arr.length;

        for(int i =0; i<d;i++){
            int first=arr[0];

            for(int j =0;j<n-1;j++){
                arr[j]=arr[j+1];
            }

            arr[n-1] = first;
        }
    }

    public static void rightrotte(int[] arr,int d){
        int n = arr.length;
        for (int i = 0; i < d; i++) {

            int last = arr[n - 1];

            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

    }
    
}
