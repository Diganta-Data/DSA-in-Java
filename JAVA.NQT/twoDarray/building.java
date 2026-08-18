import java.util.*;
public class building {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("enter the size of row:");
           int row = sc.nextInt();
           System.out.print("enter the size of cols:");
           int cols = sc.nextInt();

           int [][] arr = new  int[row][cols];
           for(int i=0;i<row;i++){
            for(int j =0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
           }
           int =0;
           for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){

                if(arr[i][j]==0)
                    count +=1;
            }
           } 
           System.out.print(count+" ");           
    }
    
}
