/**
 * Created by Adam on 11/28/2014.
 */
import java.util.ArrayList;

public class Problem26 {

    public static void Solve() {
        int d = 0;
        int m = 0;
        for (int i = 1; i <= 1000; i++){
            int q = CountRepDig(1,i);
            if (q > m){
                d = i;
                m = q;
            }
        }
        System.out.println(d);
    }

    private static int CountRepDig(int n, int d){
        ArrayList<Integer> r = new ArrayList<Integer>();
        int q = n%d;
        while (!r.contains(q)){
            r.add(q);
            q = (q*10)%d;
        }
        int l = r.size()-r.indexOf(q);
        return l;
    }

}
