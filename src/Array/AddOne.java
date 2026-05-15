package Array;

import java.util.ArrayList;
import java.util.Collections;

public class AddOne {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 1};

        System.out.print("Original number: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        ArrayList<Integer> result = addOne(arr);

        System.out.print("\nAfter adding 1: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static ArrayList<Integer> addOne(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int sum = arr[i] + carry;
            ans.add(sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(1);
        }

        // digits were added in reverse
        Collections.reverse(ans);

        return ans;
    }
}
