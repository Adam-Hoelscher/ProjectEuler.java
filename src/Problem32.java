/**
 * Created by Adam on 11/28/2014.
 */
public class Problem32 {

    public static void Solve() {

        long sum = 0;

        for (int i = 1000; i <= 9876; i++){
            String iString = String.valueOf(i);
            for (int f = 1; f <= Math.sqrt(i); f++){
                String fString = String.valueOf(f);
                if (Func.HasUniqueNumerals(fString + iString)){
                    if (i % f ==0){
                        int q = i / f;
                        String qString = String.valueOf(q);
                        String s = iString + fString + qString;
                        if (s.length()==9 & Func.IsPandigital(s)) {
                            sum += i;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }

}
