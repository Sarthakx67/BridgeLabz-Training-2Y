//Calculate Average of Three Numbers
import java.util.*;
public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double no1 = sc.nextInt();
        double no2 = sc.nextInt();
        double no3 = sc.nextInt();
        double ans = (no1+no2+no3)/3;
        System.out.println(ans);
    }
}
