/**
 * Created by Adam on 11/28/2014.
 */
import java.util.ArrayList;

public class Problem23 {

    public static void Solve() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int total = 0;
        for (int i = 1; i <= 28123; i++){
            boolean isSum=false;
            if (IsAbundant(i)){temp.add(i);}
            for (Object k : temp){
                if (temp.contains(i-(Integer)k)){
                    isSum=true;
                    break;
                }
            }
            if (!isSum) {total+=i;}
        }
        System.out.println(total);
    }

    private static boolean IsAbundant (int i){
        int temp = 0;
        for (int f = 1; f < i; f++){
            if (i%f==0){temp+=f;}
        }
        return (temp > i);
    }
}
