package Methods;

public class PassbyValueANDPasbyReference {
    public static void change(int x ){
        x = 10;

    }
    public static void main(String[] arg){
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }




}
