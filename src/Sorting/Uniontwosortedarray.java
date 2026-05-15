package Sorting;
import java.util.ArrayList;
import java.util.*;
public class Uniontwosortedarray {
    public static void main(String[] args){
        int[] a={1,3,5,7,8};
        int[] b={2,3,4,5};

        ArrayList<Integer> ans =union(a,b);
        System.out.print(ans);
    }
    public static ArrayList<Integer> union(int[] a, int[] b){
        int i=0; int j=0;
        ArrayList<Integer> result =new ArrayList<>();

        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                result.add(a[i]);
                i++;

            }
            else if(a[i]>b[j]){
                result.add(b[j]);
                j++;
            }else{
                result.add(a[i]);
                i++;
                j++;
            }

        }
        while(i<a.length) {
            if (i > 0 && a[i] != a[i - 1]) {
                result.add(a[i]);
            }
            i++;
        }
            while(j<b.length){
                if (j > 0 && b[j] != b[j-1]) {
                    result.add(b[j]);

                }
                j++;
            }
            return result;
        }

}

