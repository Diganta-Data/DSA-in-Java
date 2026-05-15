package Array;

public class PassingArrayToMethods {
    public static void main(String[] args){

        int[] x={12,67,45,90,34};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2]=30;
    }
}
