package Array;

public class PassingArrayTwoMethods {
    public static void main(String[] arg){
        int[] x= {23,56,90,45,87};
        System.out.println(x[2]);

        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2]=99;
    }
}
