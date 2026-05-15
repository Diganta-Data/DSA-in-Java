package Condition_statemante;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price:");
        System.out.println("enter the selling price:");

        int cp= sc.nextInt();
        int sp = sc.nextInt();

        if(sp>cp)
            System.out.println("the seller has made profit");

        else if (sp==cp) {
            System.out.println("the seller no profit no loss");


        }
        else
                    System.out.println("the seller has made loss");


        }
    }


