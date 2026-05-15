package Array;

public class TwoSum {
    public static void main(String[] args){
        int[] arr={2,5,9,3,5,1};
        int terget=6;
        boolean result= twosum(arr,terget);

        System.out.println(result);

    }
    public static boolean twosum(int[] arr,int terget){
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==terget) {
                    return true;
                }
            }
        }
        return false;
    }
}
