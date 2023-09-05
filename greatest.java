import java.util.*;

public class greatest {
    public static void greatestno(int a, int b) {
        if (a > b) {
            System.out.println("gratest no is " + a);
        } else {
            System.out.println("gratest no is " + b);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestno(a, b);

    }

}