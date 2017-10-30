/**
 * Created by Adam on 11/27/2014.
 */
public class Problem5 {

    public static void Solve() {
        long t = 1;
        for (int i = 1; i <= 20; i++) {
            t = Func.LCM(t, i);
        }
        System.out.println(t);
    }

}
