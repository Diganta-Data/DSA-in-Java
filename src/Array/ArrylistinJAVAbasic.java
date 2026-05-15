package Array;
import java.util.ArrayList;
public class ArrylistinJAVAbasic {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(20);
        arr.add(50);
        arr.add(60);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.get(2));
        arr.set(4,90);

        System.out.println(arr);

        int n=arr.size();

        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) +" ");
        }System.out.println();
         for(int ele: arr){
             System.out.print(ele+" ");

                     }

    }
}
