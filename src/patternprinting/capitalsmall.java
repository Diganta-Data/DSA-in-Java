package patternprinting;

import java.util.Scanner;

public class capitalsmall {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        for(int i=1; i<=n; i++ ){ //kitna line hoga
            for(int j=1; j<=n; j++){ //har line main kitna star hoga
                if(i%2==1) {

                    System.out.print((char) (i + 96) + " ");
                } else {
                    System.out.print((char) (i + 64) + " ");
                }

            }
            System.out.println();
        }

    }
}
