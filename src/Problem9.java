/**
 * Created by Adam on 11/27/2014.
 */
public class Problem9 {

    public static void Solve() {

        for (int c = 1; c < 1000; c++) {
            for (int b = (1000-c)/2; b < (1000-c); b++) {
                int a = (1000 - b - c);
                if (a*a+b*b==c*c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a * b * c);
                }
            }
        }
    }

}
