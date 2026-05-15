package Array;

public class ReverseArray {
    public static void main(String[] arg) {
        int[] arr = {23, 56, 89, 0, 4, 43, 67};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}