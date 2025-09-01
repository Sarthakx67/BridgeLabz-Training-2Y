//Calculate Simple Interest
import java.util.*;
public class Calculate_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int ans = (principal*rate*time)/100;
        System.out.println(ans);
    }
}
