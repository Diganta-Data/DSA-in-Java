package OOPS;

public class Revision {
    private static class pokemon{
        int hp;
        int speed;
        int attack;
        int defenss;
        String type;
        String name;
    }
    public static void main(String[] args){
        pokemon p1 = new pokemon();
        p1.name = "pikachu";
        p1.type="electric";
        p1.attack = 70;

        pokemon p2= new pokemon();
        p2.name = "sijuka";
        p2.type = "fire";
        p2.attack = 87;

        System.out.println(p1.type);
    }
}
