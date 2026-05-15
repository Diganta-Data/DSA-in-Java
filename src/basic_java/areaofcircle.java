package basic_java;

import java.util.Scanner;

public class areaofcircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//when we take input
        System.out.println("enter the redius:");


        double r = sc.nextDouble();
        double area=(3.14*r*r);
        System.out.println("area is:");
        System.out.println(area);

    }
}
