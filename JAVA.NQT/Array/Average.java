public class Average {
    public static void main(String[] args){

        int n = 6;
        int[] arr ={2,4,5,6,7,1};

        double sum = 0;
        for(int i =0;i<=n-1;i++){
            sum += (double) arr[i];
        }

        double average = sum/n;
        System.out.print("The average is:"+average+" ");
    }
    
}
