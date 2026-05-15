package Sorting;

public class countInversion {
    static int count = 0 ;
    public static void main(String[] args){
        int[] arr={2,4,1,3,5};

        mergesort(arr);
        System.out.print(count+" ");
    }

    private static void mergesort(int[] arr){
        int n =arr.length;
        if(n<=1) return;


        //create 2 new empty arrays of size n/2
        int[] a =new int[n/2];
        int[] b = new int[n - n/2];

        //copy and paste arr into a & b
        int idx = 0;
        for(int i=0; i<a.length;i++) a[i]=arr[idx++];
        for(int i=0;i<b.length;i++) b[i] =arr[idx++];

        //magic
        mergesort(a); mergesort(b);
        // merge a & b into arr
        merge(a,b,arr);



    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                count += (a.length - i);
                c[k++] = b[j++];
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length)  c[k++] = b[j++];


    }
}

