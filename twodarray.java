import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][1] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        System.out.println(matrix[1][2]);

    }

}

class bytakinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < cols; j++) {

                array[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < cols; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class checkx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < cols; j++) {

                array[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            // column
            for (int j = 0; j < cols; j++) {
                // compare
                if (array[i][j] == x) {

                    System.out.println("x found at location(" + i + "," + j + ")");
                }

            }

        }
    }
}

class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];
        // input
        // rows
        for (int i = 0; i < n; i++) {
            // column
            for (int j = 0; j < m; j++) {

                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("the spiral matrix is :");// m= column ,n=rows n*m

        int left = 0;// intial
        int top = 0;// intial
        int right = m - 1;// last column
        int bottom = n - 1;// last row
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(numbers[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(numbers[i][right]);
                right--;
            }

            for (int i = right; i <= left; i--) {
                System.out.print(numbers[bottom][i]);
                bottom--;
            }
            for (int i = bottom; i >= top; i--) {

                System.out.print(numbers[i][left]);
            }
            left++;
        }
        System.out.println();
    }

}

class matrixtranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrixtranspose = new int[n][m];
        // input
        // rows
        for (int i = 0; i < n; i++) {
            // column
            for (int j = 0; j < m; j++) {

                matrixtranspose[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("transpose of matrix:");// m= column ,n=rows n*m
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrixtranspose[i][j] + "");

            }
            System.out.println();
        }

    }
}
