package Strings;

public class SubStringSum {
    public static void main(String[] args){
       String s="12345";
        int n=s.length();

        int totalsum=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                String sub=s.substring(i,j);
                int num=Integer.parseInt(sub);

                totalsum +=num;
            }
        }
        System.out.println("Sum of all substring="+totalsum);

    }
}
