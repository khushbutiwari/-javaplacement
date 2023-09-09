import java.util.*;

// array declaration method 1
class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 60;
        marks[2] = 78;
        // System.out.println(marks[0]);
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}

// array declaration method 2
class maths {
    public static void main(String[] args) {
        int marks[] = { 23, 45, 65 };

        System.out.println(marks[0]);
    }
}

// find the element x in the array
class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < size; i++) {

            System.out.println(num[i]);
            if (num[i] == x) {
                System.out.println(1);
            }

        }
    }
}

// take name as input on and show it on the screen
class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];

        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();

        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println("names" + ' ' + (i + 1) + ' ' + "is" + ' ' + names[i]);
        }

    }

}// find the max min no in array

class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (num[i] < min) {
                min = num[i];

            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}

// take input array of number and check is sorted in ascending order or not
class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();

        }
        boolean isAscending = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;

            }
        }
        if (isAscending) {
            System.out.println("the array is sorted in ascending order");
        } else {
            System.out.println("array not sorted inthe ascebding order");
        }
    }

}
