package Methods;
import java.util.Scanner;
public class MaxOfThreeBuiltIn {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a= sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int b= sc.nextInt();
        System.out.print("Enter the 3rd number:");
        int c= sc.nextInt();
        System.out.print(Math.max(Math.max(a,b),c));
    }
}
