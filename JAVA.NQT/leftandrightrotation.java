import java.util.*;

public class leftandrightrotation {

    public void rotateRight(int[] arr,int k){
        int n =arr.length;

        if(n==0){
            return;
        }

        k=k%n;

        int[] temp = Arrays.copyOfRange(arr,n-k,n);

        for(int i=k-n-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i =0;i<k;i++){
            arr[i]=temp[i];
        }
    }
        public void rotateLeft(int[]arr,int k){
            int n = arr.length;

            if(n==0){
                return;
            }
            k =k%n;

            int[] temp =Arrays.copyOfRange(arr,0,k);

            for(int i=k;i<n;i++){
                arr[i-k]=arr[i];
            }
            for(int i =0;i<k;i++){
                arr[n-k+i]=temp[i];
            }

        }
    
    public static void main(String[] args){

        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        leftandrightrotation sol = new leftandrightrotation();
        int n = sc.nextInt();

        System.out.print("Enter the array element:");
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the size of k:");
        int k = sc.nextInt();

        System.out.print("enter the rotation choice(L for left and R for right:");
        char choice =sc.next().charAt(0);

        if(choice== 'R'|| choice == 'r'){
            sol.rotateRight(arr,k);
            System.out.print("right rotation array");
        }else if(choice=='L' || choice== 'l'){
            sol.rotateLeft(arr,k);
            System.out.print("Left rotation array");
        }else{
            System.out.print("invalid rotation");
            return;

        }
        System.out.print(Arrays.toString(arr));

    }
    
}
