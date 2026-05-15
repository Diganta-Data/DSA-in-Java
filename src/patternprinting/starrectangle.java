package patternprinting;

import java.util.Scanner;

public class starrectangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int row = sc.nextInt();
        System.out.println("Enter the col number:");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++ ){ //kitna line hoga
            for(int j=1; j<=col; j++){ //har line main kitna star hoga

                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
