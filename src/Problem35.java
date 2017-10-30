/**
 * Created by Adam on 11/28/2014.
 */
import java.util.Date;
import java.util.LinkedList;
import java.util.Stack;

public class Problem35 {

    public static void Solve() {
        System.out.println(new Date());
        trying(1000000);
        System.out.println(new Date());
    }

    private static void trying(int p) {
        long temp = 0;
        LinkedList<Integer> found = new LinkedList<Integer>();
        for (int i = 1; i < p; i++) {
            if (!(found.contains(i) | (Cycle(i) < i))) {
                if (IsCircPrime(i)) {
                    int q = i;
                    do {
                        assert (q == 2) : "q isn't equal to 2";
                        found.add(q);
                        q = Cycle(q);
                        temp += 1;
                    } while (q != i & !found.contains(q));
                }
            }
        }
        System.out.println(temp);
    }

    private static boolean IsCircPrime(int n) {
        //check for zeros
        String s = Integer.toString(n);
        if (s.length() != s.replace("0", "").length()) {
            return false;
        }
        for (int i = 0; i <= Math.log10(n); i++) {
            if (!Func.IsPrime(n)) {
                return false;
            } else {
                n = Cycle(n);
            }
        }
        return true;
    }

    private static int Cycle(int n) {
        Stack<Integer> digits = new Stack<Integer>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        int ones = digits.pop();
        while (digits.size() > 0) {
            n *= 10;
            n += digits.pop();
        }
        n *= 10;
        n += ones;
        return n;
    }

}
