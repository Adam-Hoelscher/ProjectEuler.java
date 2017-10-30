/**
 * Created by Adam on 11/28/2014.
 */
import java.util.Arrays;

public class Problem31 {

    public static void Solve() {
        int[] Coins = {200,100,50,20,10,5,2,1};
        System.out.println(CoinMake(200,Coins));
    }

    private static int CoinMake(int n, int[] Coins) {
        int q = 0;
        if (n < 0 | Coins.length == 0) {
            q = 0;
        } else if (n == 0) {
            q = 1;
        } else {
            int[] SmallCoins = Arrays.copyOfRange(Coins, 1, Coins.length);
            int a = CoinMake(n, SmallCoins);
            int b = CoinMake(n - Coins[0], Coins);
            q = a + b;
        }
        return q;
    }

}
