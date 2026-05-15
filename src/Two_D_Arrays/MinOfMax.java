package Two_D_Arrays;

public class MinOfMax {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{2,3,4,5},{5,6,7,8}};

        int minofmax=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            if(max<minofmax){
                minofmax=max;
            }
        }
        System.out.println("minimun of row maximum is:"+minofmax);
    }
}
