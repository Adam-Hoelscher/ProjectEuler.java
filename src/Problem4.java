/**
 * Created by Adam on 11/27/2014.
 */
public class Problem4 {

    public static void Solve() {
        int t;
        int m = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                t = i*j;
                if (Func.IsPalindrome(Integer.toString(t)) & (t>m))
                    m=t;
            }
        }
        System.out.println(m);
    }

}
