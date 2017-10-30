/**
 * Created by Adam on 11/28/2014.
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problem18 {

    public static void Solve(){
        int[][] Triangle = ReadValues();
        for (int r = 14; r >= 0; r--){
            for (int c = r; c >= 0; c--){
                int left = 0;
                int right = 0;
                if (r != 14){
                    left = Triangle[r+1][c];
                    right = Triangle[r+1][c+1];
                }
                int adder = 0;
                if (left > right){
                    adder = left;
                } else {
                    adder = right;
                }
                Triangle [r][c] += adder;
            }
        }
        System.out.println(Triangle[0][0]);
    }

    private static int[][] ReadValues(){
        String path = "C:/ProjectEuler/p018_triangle.txt";
        String s = Func.readFile(path);
        s = s.replace("\n","");
        int[][] temp = new int[15][15];
        for (int r = 0; r < 15; r++){
            for (int c = 0; c <= r; c++){
                String q = s.substring(0,2);
                s = s.substring(3);
                temp[r][c] = Integer.valueOf(q);
            }
        }
        return temp;
    }

}
