import java.util.*;

public class CoinChange {
    public static int change(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int[] dp = new int[amount + 1];
        for (int x = 1; x < dp.length; x++) {
            dp[x] = amount+1;
            for (int coin : coins) {
                if (x >= coin && dp[x - coin] != amount+1) {
                    dp[x] = Math.min(dp[x], dp[x-coin] + 1);
                }
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(change(coins, 6));
    }
}
