package Strings;

import java.util.Scanner;

public class Countdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =""+n;
        System.out.println(s.length());
        double d =3.15;
        String f="sonu";
        f +=d;
        System.out.println(f.length());
        String str ="45347";
        int p =Integer.parseInt(str);
        System.out.println(p+1);
    }

}
