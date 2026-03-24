import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        
        Collections.sort(list);
        for (int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    }
}