/**
 * Created by Adam on 11/27/2014.
 */
public class Problem10 {

    public static void Solve() {

        int i = 1;
        int sum = 0;
        do {
            i += 2;
            if (Func.IsPrime(i)) {
                sum += i;
            }
        } while (i<2000000);
        System.out.println(sum);
    }

}
