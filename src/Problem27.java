/**
 * Created by Adam on 11/28/2014.
 */
import java.util.Arrays;

public class Problem27 {

    public static void Solve() {
        long[] m = {0,0,0};
        for (int a = -1000; a < 1000; a++) {
            for (int b = -1000; b < 1000; b++) {
                if (a*b==-59231){
                    int stop = 0;
                }
                int q = QuadPrimes(a, b);
                if (q > m[0]) {
                    m[0] = q;
                    m[1] = a;
                    m[2] = b;
                }
            }
        }
        System.out.println(Arrays.toString(m));
    }

    private static int QuadPrimes(int a, int b){
        int iCount = -1;
        long q = 0;
        do {
            iCount++;
            q = (long)(Math.pow(iCount,2) + a*iCount + b);
        } while (Func.IsPrime(q));
        return iCount;
    }

}
