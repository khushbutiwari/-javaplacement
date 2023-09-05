import java.util.*;

public class solution {
  public static int average(int a, int b, int c) {
    /* int average = (a + b + c) / 3; */
    return (a + b + c) / 3;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    /* int average = (a + b + c) / 3; */
    System.out.print("average" + (a + b + c) / 3);

  }
}