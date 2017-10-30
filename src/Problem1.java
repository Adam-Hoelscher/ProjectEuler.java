/**
 * Created by Adam on 11/27/2014.
 */
public class Problem1 {

    public static void Solve() {
        int t = 0;
        for (int n = 0; n < 1000; n++)
        {
            if (n % 3 == 0 || n % 5 == 0)
            {
                t += n;
            }
        }
        System.out.println(t);
    }

}
