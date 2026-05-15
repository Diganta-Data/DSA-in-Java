package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the searching number:");
        int x = sc.nextInt();


        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        boolean flag=false;//terget(x) is not present in array

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                System.out.println("Terget exists in array at index "+i);
                flag = true;//terget is present in array
                break;
            }
        }
        if(flag==true)System.out.print("Searching Elements present in Arry");

    else
                System.out.print("Searching Elements is not present in Arry");




        System.out.println();
    }
}


