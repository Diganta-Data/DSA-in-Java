package recersion;

public class functioncallitself {
    public static void main(String[] args){
        ajay(1);
    }
    public static void ajay(int n){
        if(n==5 ) return;
        System.out.println("RIYA");
        ajay(n+1);
    }
}
