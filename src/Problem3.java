/**
 * Created by Adam on 11/27/2014.
 */
public class Problem3 {

    public static void Solve() {
        long t = 600851475143L;
        int f = 2;
        do {
            if (t % f == 0)
                t /= f;
            else
                f += 1;
        } while (f < t);
        System.out.println(t);
    }

}
