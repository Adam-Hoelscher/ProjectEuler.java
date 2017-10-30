/**
 * Created by Adam on 11/27/2014.
 */
public class Problem2 {

    public static void Solve() {
        int t = 0;
        int f0 = 1;
        int f1 = 1;
        int ft = 0;
        do
        {
            ft = f1 + f0;
            f0 = f1;
            f1 = ft;
            if (f1 % 2 == 0)
                t += f1;
        } while (f1<4000000);
        System.out.println(t);
    }

}
