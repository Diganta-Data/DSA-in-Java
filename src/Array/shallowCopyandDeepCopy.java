package Array;
import java.util.Arrays;

public class shallowCopyandDeepCopy {
    public static void main(String[] arg){
        int a =4;
       int[] arr={23,45,67,89};
       // int[] x= arr;//shallowcopy
        //x[0]=100;
        int[] y = Arrays.copyOf(arr,arr.length);//deep copy
        y[0]=100;
        System.out.println(y[0]+" ");

        System.out.println(arr[0]+" ");
    }
}
