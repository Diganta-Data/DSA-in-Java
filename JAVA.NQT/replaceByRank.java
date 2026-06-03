import java.util.*;

public class replaceByRank {
    public static void main(String[] arg){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.print("Enter the array Elemant:");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] rankarr = arr.clone();

        Arrays.sort(rankarr);

        HashMap<Integer,Integer> map = new HashMap<>();

        int rank = 1;

        for(int num : rankarr){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=map.get(arr[i]);
        }
        System.out.print("Rank of Array:");
        for(int num :result){
            System.out.print(num+" ");
        }

        
    }
    
}
