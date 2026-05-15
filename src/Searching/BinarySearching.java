package Searching;

public class BinarySearching {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,5,5,6};
        int n=nums.length;

        int low=0;
        int high=n-1;
        int target=5;

        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                System.out.println("Element found at index: "+mid);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }


    }
}
