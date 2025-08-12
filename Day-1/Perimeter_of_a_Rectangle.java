//Perimeter of a Rectangle
import java.util.*;
public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int ans = 2 * (length + width);
        System.out.println(ans);
    }
}