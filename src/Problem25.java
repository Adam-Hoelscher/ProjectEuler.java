/**
 * Created by Adam on 11/28/2014.
 */
import java.math.BigInteger;

public class Problem25 {

    public static void Solve() {

        BigInteger f1;
        BigInteger f2 = new BigInteger("0");
        BigInteger f3 = new BigInteger("1");
        int i = 1;

        while (f3.toString().length() < 1000) {
            f1 = f2;
            f2 = f3;
            f3 = f2.add(f1);
            i++;
        }

        System.out.println(i);

    }

}
