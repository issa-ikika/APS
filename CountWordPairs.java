import java.util.Scanner;

public class CountWordPairs {

    //TODO: implement function
    public static int countWordPairs(String [] words) {
        int sumPairs = 0;
        int i = 0;

        while( i < words.length) {
            int j = i + 1;

            while(j < words.length) {
                if(words[i].charAt(0) == words[j].charAt(0)) {
                    sumPairs++;
                }
                j++;
            }
            i++;
        }

        return sumPairs;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        String words[] = new String[N];

        for(int i=0;i<N;i++) {
            words[i] = input.next();
        }

        System.out.println(countWordPairs(words));

    }
}