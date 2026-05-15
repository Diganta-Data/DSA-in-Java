package Strings;

public class PassingStringTwoMethod {
    public static void change(String x){
        x="digha da";
    }
    public static void main(String[] args){
        String x= "Diganta";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
