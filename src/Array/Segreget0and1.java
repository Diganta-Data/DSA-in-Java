package Array;

public class Segreget0and1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1};

        int numberOfzeros = 0;
        int numberOfOnes = 0;
        //count zeros and ones
        for (int ele : arr) {
            if (ele == 0) {

                numberOfzeros++;

            }

        else{

                numberOfOnes++;
            }

        }
        //segregate array
        for (int i =0;i<numberOfzeros;i++){
            arr[i]=0;
        }
        for(int  i=numberOfzeros;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.print("Segregated array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}