package Array;

public class ConvertToWave {
    public static void main(String[] args){
        int[] arr={2,4,6,5,9,8,7};
        int i=0; int j=1;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        convertTowave(arr,i,j);
        System.out.print("Convert To Wve:");
        for(int val : arr){
            System.out.print(val+" ");
        }

    }
    public static void convertTowave(int[] arr, int i, int j){
        for( i=0;i<arr.length-1;i +=2){
             int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
        }
    }
}
