package Two_D_Arrays;

import java.util.ArrayList;

public class TWOD_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3); a.add(4); a.add(7); a.add(8);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(3); b.add(4); b.add(7); b.add(8);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(3); c.add(4); c.add(7); c.add(8);
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);

        for(int i =0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");

            }
            System.out.println();
        }
    }
}
