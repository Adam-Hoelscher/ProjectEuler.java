/**
 * Created by Adam on 11/28/2014.
 */
public class Problem37 {

    public static void Solve(){

        int count = 0;
        int temp = 0;
        int i = 10;

        do {
            i++;
            if (IsTruncPrime(i)){
                count++;
                temp+=i;
            }
        } while (count < 11);

        System.out.println(temp);
    }

    private static boolean IsTruncPrime(int n){

        String s = Integer.toString(n);

        if (s.length() < 2){return false;}
        if (!Func.IsPrime(n)){return false;}

        for (int i = 1; i < s.length(); i++) {
            String part = s.substring(i);
            if (!Func.IsPrime(Integer.valueOf(part))){return false;}
        }

        for (int i = 1; i < s.length(); i++) {
            String part = s.substring(0,i);
            if (!Func.IsPrime(Integer.valueOf(part))){return false;}
        }

        return true;
    }

}
