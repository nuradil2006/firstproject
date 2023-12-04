import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ff = {0,1};
        String ss = "[0, 1";
        if(n == 1){
            System.out.println("[0, 1]");
            System.exit(0);
        }
        if (n == 0) {
            System.out.println("[]");
            System.exit(0);
        }
        while (ff[0] + ff[1] < n) {
            int i = ff[0] + ff[1];
            ss += ", " + i;
            ff[0] = ff[1];
            ff[1] = i;

        }
        System.out.println(ss + "]");
    }
}
