import java.util.Scanner;


public class smallestele {
    public static void main(String[] args){
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("The smallest element is:");

        System.out.println(min);

    }
    
}
