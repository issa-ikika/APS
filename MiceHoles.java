import java.util.Scanner;
import java.util.Arrays;

public class MiceHoles {

    public static int minTime(int mice[], int holes[]) {
        int max = 0;
        Arrays.sort(mice);
        Arrays.sort(holes);

        for (int i = 0; i < holes.length; i++) {
            if(max < Math.abs(mice[i] - holes[i])) {
                max = Math.abs(mice[i] - holes[i]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String parts[] = line.split(" ");
        int mice[] = new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            mice[i] = Integer.parseInt(parts[i]);
        }

        line = input.nextLine();
        parts = line.split(" ");
        int holes[] = new int[parts.length];
        for(int i=0;i<parts.length;i++) {
            holes[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(minTime(mice, holes));
    }
}
