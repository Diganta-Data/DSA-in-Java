import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args){

        int[] arr = {2,3,4,2,5,4,3};

        HashSet<Integer> set = new HashSet<>();
        System.out.println("After removing Duplicates:");

        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);

                System.out.print(num+" ");
            }
        }
        
    }

    
}
