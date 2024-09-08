

public class FindMissingObservations {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int m = rolls.length;
        int rollsSum = 0;
        for (int num : rolls) {
            rollsSum += num;
        }
        int remainingSum = mean * (m + n) - rollsSum;
        if (n < remainingSum || n * 6 > remainingSum)
            return new int[]{};
        int remainder = remainingSum % n;
        int expectedAvg = remainingSum / n;

        for (int i = 0; i < remainder; i++) {
            ans[i] = expectedAvg + 1;
        }
        for (int i = remainder; i < n; i++) {
            ans[i] = expectedAvg;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] rolls = {1, 5, 6};
    }
}
