import java.util.*;

public class solutions {
    public static double radius(double r) {
        double circumference = 2 * 3.14 * r;
        return circumference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(radius(r));

    }

}
