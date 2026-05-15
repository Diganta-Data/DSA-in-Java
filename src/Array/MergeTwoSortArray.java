package Array;

public class MergeTwoSortArray {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 7};
        int[] b = {7, 9, 10, 12, 20, 30};

        int[] c = new int[a.length + b.length];

        System.out.print("merge array is:");
        for (int ele : c) {
            System.out.print(ele + " ");

        }System.out.println();
        merge(c, a, b);
        System.out.print("Merge the sorted Array:");
        for (int val : c) {
            System.out.print(val + " ");

        } System.out.println();

    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }

        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
}