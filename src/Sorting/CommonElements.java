package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args){
        int[] a={1,4,2,5,2,6};
        int[] b={4,1,2,6,7,6};

        ArrayList<Integer> result = commonele(a,b);
        System.out.println("Common Elements:"+result);


    }
    public static ArrayList<Integer> commonele(int[] a, int[] b){
        int i=0; int j=0;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans =new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i]<b[j]) i++;
            else j++;
            }
        return ans;
        }
}

