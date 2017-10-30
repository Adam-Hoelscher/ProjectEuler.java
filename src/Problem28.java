/**
 * Created by Adam on 11/28/2014.
 */
public class Problem28 {

    public static void Solve() {

        int sum = 1;
        int n = 1;
        int inc = 2;

        while (n<(1001*1001)){
            for (int i = 0; i < 4; i++){
                n+=inc;
                sum+=n;
            }
            inc+=2;
        }

        System.out.println(sum);
    }

}
