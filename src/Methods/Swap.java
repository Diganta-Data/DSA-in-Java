package Methods;
import java.util.Scanner;

public class Swap {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a= sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println(a+" "+b);

        int temp= a;

        a=b;

        b=temp;

        System.out.println(a+" "+b);


    }
}
