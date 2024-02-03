import java.util.*;

import java.util.Scanner;

public class MaxCycleLengthCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                int maxCycleLength = calMaxCycleLength(i, j);
                System.out.println(i + " " + j + " " + maxCycleLength);
            } catch (Exception e) {
                break; 
            }
        }

        scanner.close();
    }

    private static int calculateCycleLength(int n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }
        return length;
    }

    private static int calMaxCycleLength(int a, int b) {
        int maxCycleLength = 0;
        for (int num = a; num <= b; num++) {
            int currentCycleLength = calculateCycleLength(num);
            maxCycleLength = Math.max(maxCycleLength, currentCycleLength);
        }
        return maxCycleLength;
    }
}
