import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  // 개행 제거
        String[] l = new String[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextLine();
            String[] words = l[i].split(" ");
            String reverse = "";

            for (int j = words.length - 1; j >= 0; j--) {
                reverse += words[j] + " ";
            }

            // 마지막 공백 제거
            reverse = reverse.trim();

            System.out.println("Case #" + (i+1) + ": " + reverse);

        }
    }
}
