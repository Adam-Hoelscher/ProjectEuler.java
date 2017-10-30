/**
 * Created by Adam on 11/27/2014.
 */
public class Problem15 {

    public static void Solve() {

        int size = 20;
        long[][] grid = new long[size+1][size+1];
        grid[0][0]=1;

        for (int r = 0; r < size+1; r++){
            for (int c = 0; c < size+1; c++){
                if (r + c > 0) {
                    long left;
                    long up;
                    if (c == 0) {
                        left = 0;
                    } else {
                        left = grid[r][c - 1];
                    }
                    if (r == 0) {
                        up = 0;
                    } else {
                        up = grid[r - 1][c];
                    }
                    grid[r][c] = up + left;
                }
            }
        }

        System.out.println(grid[size][size]);

    }

}
