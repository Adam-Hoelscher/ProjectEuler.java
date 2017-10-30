/**
 * Created by Adam on 11/27/2014.
 */
import java.math.BigInteger;

public class Problem16 {

    public static void Solve() {

        BigInteger temp = new BigInteger("2");
        temp = temp.pow(1000);
        int sum = 0;

        for (int i = 0; i < temp.toString().length(); i++){
            sum += Integer.valueOf(temp.toString().substring(i,i+1));
        }

        System.out.println(sum);
    }

}
