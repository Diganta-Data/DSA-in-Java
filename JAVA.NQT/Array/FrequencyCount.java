import java.util.Scanner;
import java.util.HashMap;


public class FrequencyCount {
    public static void main(String[] args){
        System.out.print("Enter the size of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        for(int key :map.keySet()){

            System.out.println(key+ "  " + map.get(key));
        }
    }
    
}
