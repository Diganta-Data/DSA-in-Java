package Two_D_Arrays;

public class Rowwithmaxsum {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{4,5,6,7},{8,9,6,4}};

        int maxsum=Integer.MIN_VALUE;
        int row=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum +=arr[i][j];
            }
           if(sum>maxsum){
               maxsum=sum;
               row=i;
           }
        }
        System.out.println(row+" "+maxsum);
    }
}
