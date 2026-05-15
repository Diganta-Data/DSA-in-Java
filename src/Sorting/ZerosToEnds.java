package Sorting;

public class ZerosToEnds {
    public static void nonzeros(int[] arr){
        int  k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                arr[k]=arr[i];

                k++;
            }

        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,-6,0,4,0,3,0,9,7};

        nonzeros(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
