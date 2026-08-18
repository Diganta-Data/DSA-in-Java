import java.util.*;
public class warehouse {
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

        int maxtotal=0;
        int self=0;
        for(int i=0;i<row;i++){
            int total =0;
            for(int j=0;j<cols;j++){
                total += arr[i][j];
            }
            if(total>maxtotal){
                maxtotal=total;
                self=i;
            }
        }
        System.out.println("self:"+(self+1));
        System.out.println("maxvalue:"+maxtotal);
    }
    
}
