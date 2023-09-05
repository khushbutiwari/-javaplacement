import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("is adult");
        } else {

            System.out.println("is not adult");

        }
    }

}

// conditional statement based on the condition
class evenodd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        if (x % 2 == 0) {
            System.out.println("is even no");

        } else {
            System.out.println("odd no");
        }
    }
}

class comparison {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();

        if (x == y) {
            System.out.println("is equal");
        } else if (x > y) {
            System.out.println("is greater");
        } else {
            System.out.println("is lesser");
        }

    }
}

// switch is ued to print the statement case wise
class greeting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int button = obj.nextInt();

        if (button == 1) {
            System.out.println("hello");

        } else if (button == 2) {
            System.out.println("namste");
        } else if (button == 3) {
            System.out.println("bonjour");
        } else {
            System.out.println("none");
        }
    }
}

class greet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int button = obj.nextInt();

        switch (button) {
            case 1:
                System.out.println("namste");
                break;
            case 2:
                System.out.println("bonjour");
                break;
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

