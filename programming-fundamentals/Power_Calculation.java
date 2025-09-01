//Power Calculation
import java.util.*;
public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextInt();
        double exponent = sc.nextInt();
        double ans = Math.pow(base, exponent);
        System.out.println(ans);
    }
}
