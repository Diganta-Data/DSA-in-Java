package Array;

public class ProductofArray {
    public static void main(String[] arg){
        int[] arr={2, 5, 6, 8, 7};
        int product=1;
        for(int i=0;i<arr.length;i++){

            product *=arr[i];
        }
        System.out.println(product);
    }
}
