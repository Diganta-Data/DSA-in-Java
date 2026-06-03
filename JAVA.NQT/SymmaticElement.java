import java.util.*;


public class SymmaticElement {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs:");

        int n = sc.nextInt();

        System.out.print("Enter the pair element:");
        int[][] arr = new int[n][2];

        for(int i =0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.print("The symmtric pairs is:");

         for(int i =0; i<n; i++){

            int first = arr[i][0];
            int second= arr[i][1];

            if(map.containsKey(second) && map.get(second)==first){
                System.out.print("("+first+","+second+")");
            }else{
                map.put(first,second);
            }
        }
    }
    
}
