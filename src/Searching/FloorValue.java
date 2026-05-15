package Searching;

public class FloorValue {
    public static void main(String[] args){
        int[] nums={1,2,4,6,8,9};

        int n=nums.length;
        int low=0;
        int high=n-1;
        int target=5;
        int floor=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
                floor=mid;
            }else{
                floor=mid;
                break;
            }
        }
        if(floor ==-1){
            System.out.println("no floor exists");
        }else{
            System.out.println("Floor index is:"+floor);
            System.out.println("Floor value is:"+nums[floor]);
        }
    }
}
