import java.util.*;


public class ProductOfSubArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");

        int n = sc.nextInt();

        System.out.print("Enter the element of Array:");
        int[]arr =new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxpro=arr[0];
        int minpro=arr[0];
        int result=arr[0];

        for(int i =1;i<n;i++){
            int current = arr[i];

            if(current<0){
                int temp = maxpro;
                maxpro = minpro;
                minpro = temp;
            }

            maxpro=Math.max(current,current*maxpro);
            minpro=Math.min(current,current*minpro);
            result=Math.max(result,maxpro);
        }
        System.out.print("the maxinum product is++"+result);
    }
    
}
