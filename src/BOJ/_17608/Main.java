import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (h[i] > max) {
                max = h[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
