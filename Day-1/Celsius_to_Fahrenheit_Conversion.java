//Celsius to Fahrenheit Conversion
import java.util.*;
public class Celsius_to_Fahrenheit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = (n*9/5) + 32;
        System.out.println(f);
    }
}
