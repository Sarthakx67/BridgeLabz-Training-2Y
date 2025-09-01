//4. Area of a Circle
import java.util.*;
public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double ans = pi*(radius*radius);
        System.out.println(ans);
    }
}
