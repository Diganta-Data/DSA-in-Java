import java.util.*;

public class NonRepeatedElement {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.print("Enter the array Element:");
        int[] arr = new int[n];
        for(int i =0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.print("The non Repeated Elements are:");

        for(int num : arr){
            if(map.get (num)==1){
                System.out.print(num+" ");
            }
        }
    }
    
}
