/**
 * Created by Adam on 11/27/2014.
 */
public class Problem7 {

    public static void Solve() {

        int i = 1;
        int count = 0;
        do {
            i += 1;
            if (Func.IsPrime(i)){
                count++;
            }
        } while (count<10001);
        System.out.println(i);

    }

}
