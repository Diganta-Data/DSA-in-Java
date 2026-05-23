import java.util.*;

public class repetatedElement2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();

        System.out.print("Enter the array element:");
        int[] arr = new int[n];

        for(int i =0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
               System.out.print(num+" ");
            }else{
                set.add(num);
            }
        }
    }
    
}
