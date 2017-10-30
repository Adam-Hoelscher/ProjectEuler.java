/**
 * Created by Adam on 11/27/2014.
 */
public class Problem6 {

    public static void Solve() {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i <= 100; i++) {
            s1 += i;
            s2 += (i*i);
        }
        System.out.println(Math.pow(s1,2)-s2);
    }

}
