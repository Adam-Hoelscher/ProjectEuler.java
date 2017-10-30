/**
 * Created by Adam on 11/28/2014.
 */
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem29 {

    public static void Solve() {

        ArrayList<BigInteger> combos = new ArrayList<BigInteger>();

        for (int a = 2; a <= 100; a++){
            for (int b = 2; b <= 100; b++){
                BigInteger q =  new BigInteger(String.valueOf(a)).pow(b);
                if (!ValueIn(combos, q)){combos.add(q);}
            }
        }

        System.out.println(combos.size());
    }

    private static boolean ValueIn(ArrayList l, Object q){

        boolean match = false;

        for (int i = 0; i < l.size(); i++){
            if (l.get(i).toString().equals(q.toString())){
                match = true;
                break;
            }
        }

        return match;
    }

}
