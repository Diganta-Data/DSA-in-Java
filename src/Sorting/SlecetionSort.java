package Sorting;

public class SlecetionSort {
    public static void print(int[] arr){

        System.out.println("The arrays index:");
        for(int ele : arr){
            System.out.print(ele+" ");

        }

        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={3,8,0,-4,8,-1,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int mindx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);


    }

}
