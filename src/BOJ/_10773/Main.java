import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int money = sc.nextInt();
            if (money == 0) {
                stack.pop();
            } else {
                stack.push(money);
            }

        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
