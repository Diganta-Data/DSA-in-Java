package Two_D_Arrays;

public class ReverseRow {
    public static void main(String[] args){
        int [][] arr={{1,2,3,4},{2,3,4,5},{3,4,5,6}};

        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            int left=0;
            int right=col-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                right--;
                left++;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
