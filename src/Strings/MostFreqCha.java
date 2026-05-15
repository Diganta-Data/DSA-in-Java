package Strings;

public class MostFreqCha {
    public static void main(String[] args){
        String s ="diganta";
        int n= s.length();
        int maxfreq=0;
        char mostfrecha=0;

        for(int i=0;i<n;i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }

            }
            if (count > maxfreq) {
                maxfreq = count;
                mostfrecha = s.charAt(i);
            }
        }
        System.out.println("most frequent character:"+mostfrecha);
        System.out.println("Max frequency is:"+maxfreq);

    }
}
