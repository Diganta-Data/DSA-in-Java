import java.util.*;
public class farmerfield {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of row:");
        int row = sc.nextInt();

        System.out.print("enter the size of cols");
        int cols = sc.nextInt();

        int[][] field = new int[row][cols];
        for(int i =0;i<row;i++){
            for(int j=0;j<cols;j++){
                field[i][j]=sc.nextInt();
            }
        }
        boolean[][] wartered = new boolean[row][cols];
        for(int i =0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(field[i][j]==1){
                    wartered[i][j]=true;

                    if(i-1>=0){
                        wartered[i-1][j]=true;
                    }
                    if(i+1<row){
                        wartered[i+1][j]=true;
                    }
                    if(j-1>=0){
                        wartered[i][j-1]=true;
                    }
                    if(j+1<cols){
                        wartered[i][j+1]=true;
                    }
                }
                    
            }
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(wartered[i][j]){
                    count++;
                }
            }
        }
        System.out.print(count);

    }
    
}
