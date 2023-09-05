package javaplacement.pattern;
import java.util.*;

class pattern {
    // solid rectangle

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // outerloop
        for (int i = 1; i <= n; i++) {
            // how mny time
            // System.out.println("*****");
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
                // how much
            }
            System.out.println();
        }

    }

}
