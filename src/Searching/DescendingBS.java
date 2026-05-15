package Searching;

public class DescendingBS {
    public static void main(String[] args){
        int nums[]={98,88,77,65,54,44};
        int n=nums.length;

        int low=0;
        int high=n-1;
        int target=65;

        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                low=mid+1;
            }
            else if(nums[mid]<target){
                high=mid-1;
            }else{
                found=true;
                System.out.println("The Target Element Index is:"+mid);
                break;
            }
        }
        if(!found){
            System.out.println("Target Element is not found");
        }

    }
}
