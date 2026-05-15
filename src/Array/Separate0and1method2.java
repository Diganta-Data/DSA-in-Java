package Array;

public class Separate0and1method2 {
    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();

        int[] arr={1,0,1,1,0,0,0,1,1};
        int i=0;int j=arr.length-1;
        System.out.print("Original arry:");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
            separat(arr,i,j);
            System.out.print("seperat arry index position:");
            for(int val : arr){
                System.out.print(val+" ");
            }
        }

    public static void separat(int[] arr, int i,int j){
        while(i<j){
            if(arr[i]==0){ i++;}
            else if (arr[j]==1) {j--;}
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }

        }
    }
}
