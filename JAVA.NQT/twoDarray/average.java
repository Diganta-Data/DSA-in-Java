import java.util.*;
public class average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row:");
        int row = sc.nextInt();
        System.out.print("Enter the value of cols:");
        int cols = sc.nextInt();

        int [][] arr = new int[row][cols];
        for(int i=0;i<row;i++){
            for(int j =0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        
        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<cols;j++){
                sum += arr[i][j];
            
            }
            double ave = sum/(double) cols;
             System.out.println("student:" +(i+1)+" "+"average:"+ave);
            
        }
       
        
    }
    
}
