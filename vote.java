import java.util.*;

public class vote {
    public static void eligibletovote(int age) {
        if (age < 18) {
            System.out.println("not eleigible to vote");

        } else {
            System.out.println(" eligible to vote");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        eligibletovote(age);

    }

}
