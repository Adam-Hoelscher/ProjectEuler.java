/**
 * Created by Adam on 11/28/2014.
 */
import java.math.BigInteger;

public class Problem20 {

    public static void Solve() {
        int temp = 0;
        BigInteger i = new BigInteger("1");
        for (int iCount = 1; iCount <= 100; iCount++){
            i = i.multiply(new BigInteger(String.valueOf(iCount)));
        }
        for (char c : i.toString().toCharArray()){
            temp +=  Integer.valueOf(String.valueOf(c));
        }
        System.out.println(temp);
    }

}
