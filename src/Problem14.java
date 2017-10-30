/**
 * Created by Adam on 11/27/2014.
 */
public class Problem14 {

    public static void Solve() {
        int longest = 1;
        int length = 1;
        for (int iLoop = 1; iLoop < 1000000; iLoop++){
            int q = CollatzCount(iLoop);
            if (q>length){
                longest = iLoop;
                length = q;
            }
        }
        System.out.println(longest);
    }

    private static int CollatzCount(long n){
        int iCount = 0;
        do {
            iCount++;
            n = Collatz(n);
        } while (n != 1);
        return iCount;
    }

    private static long Collatz(long n){
        if (n % 2 == 0){
            return n/2;
        } else {
            return 3*n+1;
        }
    }

}
