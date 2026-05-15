package recersion;

public class BinarySearchRecarsion {
    public static void main(String[] args){
        int[] arr={1,3,5,7,8,8,10};
        int target = 7;

        int n=arr.length;
        int result =helper(arr,target,0,n-1);
        System.out.println("The index number  is:"+result);
    }
    public static int helper(int[]arr,int target,int low,int high){
        if(low>high) return -1;

        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return helper(arr,target,low,mid-1);
        else return helper(arr,target,low+1,high);

    }
}
