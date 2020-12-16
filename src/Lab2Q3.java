
import java.util.Scanner;

public class Lab2Q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter R: ");
        int R = scanner.nextInt();
        checkSummation(N, R);

        scanner.close();
    }

    static void checkSummation(int N, int R) {

        for (int i = 0; i <= R/2; i++) {
            int sumSubsequentNum = sum(i ,N);
            if (sumSubsequentNum == R) {
                System.out.printf("%d = %d", R, i);
                for (int j = 1; j < N; j++)
                    System.out.print(" + " + (i + j));
                return;
            }
        }
        System.out.print("No summation of subsequent numbers");
        System.out.println();
    }

    static int sum(int current, int repetition) {
        //default
        if (repetition == 1)
            return current;
        else {
            return current + sum(current+1, repetition-1);
        }
    }
}
