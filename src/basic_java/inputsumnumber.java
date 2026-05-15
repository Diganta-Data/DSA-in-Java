package basic_java;
import java.util.Scanner;

public class inputsumnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int n1 = sc.nextInt();
        System.out.println("enter the 2nd number:");
        int n2 = sc.nextInt();
        System.out.println("enter the 3rd number:");
        int n3 = sc.nextInt();





        int sum = (n1+n2+n3);
        System.out.println("the sum is:");
                System.out.println(sum);
    }
}
