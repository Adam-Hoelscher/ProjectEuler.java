/**
 * Created by Adam on 11/28/2014.
 */
public class Problem34 {

    public static void Solve() {
        long sum = 0;

        for (int i = 3; i < 900000; i++){
            if (CheckCurious(i)){
                sum += i;
            }
        }

        System.out.print(sum);
    }

    private static boolean CheckCurious(int n){

        int sum = 0;
        int i = n;

        while (n > 0){
            int q = n % 10;
            sum += Func.Fact(q);
            n /= 10;
        }

        return (sum == i);
    }

}
