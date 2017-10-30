/**
 * Created by Adam on 11/27/2014.
 */
public class Problem12 {

    public static void Solve() {

        long iCount = 0;
        long iSum = 0;
        do {
            iCount++;
            iSum += iCount;
        } while (CountDiv(iSum)<500);
        System.out.println(iSum);

    }

    private static int CountDiv(long n) {
        long f;
        int iCount = 0;
        double s = Math.sqrt(n);
        for (f = 1; f < s; f++) {
            if (n % f == 0) {
                iCount+=2;
            }
        }
        if (Math.pow(f,2)==n){
            iCount++;
        }
        return iCount;
    }

}
