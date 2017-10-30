/**
 * Created by Adam on 11/28/2014.
 */
import java.util.Arrays;

public class Problem22 {

    public static void Solve() {

//        String path = "C:/ProjectEuler/p022_names_short.txt";
        String path = "C:/ProjectEuler/p022_names.txt";
        String s = Func.readFile(path);

        s = s.replace("\"","");
        s = s.replace("\n","");

        String[] names = s.split(",");
        Arrays.sort(names);

        int temp = 0;
        for (int i = 0; i < names.length; i++){
            temp += ((i+1) * ScoreString(names[i]));
        }
        System.out.println(temp);
    }

    private static int ScoreString(String s){
        int temp = 0;
        char[] Chars = s.toCharArray();
        for (char c : Chars){
            temp += ((int) c - 64);
        }
        return temp;
    }
}
