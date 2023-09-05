import java.util.*;
import java.io.*;

public class expotential {
    public static int getpower(int x, int n) {
        int power = (int) Math.pow(x, n);
        return power;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getpower(x, n));

    }

}
/*
 * import java.util.*;
 * 
 * 
 * public class Solutions {
 * public static void main(String args[]) {
 * System.out.println("Enter x");
 * Scanner sc = new Scanner(System.in);
 * int x = sc.nextInt();
 * System.out.println("Enter n");
 * int n = sc.nextInt();
 * 
 * 
 * int result = 1;
 * //Please see that n is not too large or else result will exceed the size of
 * int
 * for(int i=0; i<n; i++) {
 * result = result * x;
 * }
 * 
 * 
 * System.out.println("x to the power n is : "+ result);
 * }
 * }
 */
