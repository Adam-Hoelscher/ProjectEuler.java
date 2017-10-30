/**
 * Created by Adam on 11/28/2014.
 */
import java.util.Stack;

public class Problem24 {

    public static void Solve() {

        String q = FindItem(10,1000000).toString();
        System.out.println(q);

    }

    private static Stack<Integer> FindItem(int SetSize, long Number){
        Stack<Integer> Set = new Stack<Integer>();
        for (int q = 0; q < 10; q++){
            Set.add(q);
        }
        long check = Number;
        Stack<Integer> Keys = new Stack<Integer>();
        int k = Set.size();
        while (k!=0){
            long f = Func.Fact(k-1);
            int i = (int)((check-1) / f);
            Keys.add(Integer.valueOf(Set.toArray()[i].toString()));
            Set.remove(i);
            check -= (f*i);
            k = Set.size();
        }
        return Keys;
    }

}
