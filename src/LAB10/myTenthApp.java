package LAB10;

import java.util.Arrays;

public class myTenthApp {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        System.out.println(Arrays.toString(countAndSumElements(input)));
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int negatives = 0;
        int positiveSum = 0;
        for (int num : input) {
            if (num < 0) negatives++;
            else positiveSum += num;
        }
        return new int[]{negatives, positiveSum};
    }
}
