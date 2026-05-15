package recersion;

public class CountAndSay {
    public static void main(String[] args){
        String s ="111223311";
        int n =s.length();

        StringBuilder ans = new StringBuilder();


            int i = 0; int j = 0;
            while (j < n){
                if(s.charAt(i)==s.charAt(j))
                    j++;
                else{
                    int freq =j-i;
                    ans.append(freq);
                    ans.append(s.charAt(i));
                    i=j;
                }

            }
        int freq =j-i;
        ans.append(freq);
        ans.append(s.charAt(i));
        System.out.println(ans.toString());
        }
    }
