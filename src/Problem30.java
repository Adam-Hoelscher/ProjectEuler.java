/**
 * Created by Adam on 11/28/2014.
 */
public class Problem30 {

    public static void Solve() {
        System.out.print(FindPowers(5));
    }

    private static long FindPowers(int power){
        long total = 0;
        for (long i = 2; i < Math.pow(10,power+1); i++){
            if (i == CheckSum(i,power)){
                total += i;
                System.out.println(i);
            }
        }
        return total;
    }

    private static long CheckSum(long n, int power){
        long total = 0;
        long i = 0;
        while (n > 0){
            long k = n % 10;
            n /= 10;
            total += Math.pow(k,power);
        }
        return total;
    }

}
