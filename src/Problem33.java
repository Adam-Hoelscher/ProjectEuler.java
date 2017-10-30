/**
 * Created by Adam on 11/28/2014.
 */
public class Problem33 {

    public static void Solve() {

        int nProd = 1;
        int dProd = 1;

        for (int d = 10; d < 100; d++){
            for (int n = 10; n < d; n++){
                if (CheckSpecial (n, d)){
                    nProd *= n;
                    dProd *= d;
                }
            }
        }

        System.out.println(dProd / Func.GCD(nProd, dProd));
    }

    private static boolean CheckSpecial(int n, int d){

        boolean temp = false;
        String nString = new Integer(n).toString();
        String dString = new Integer(d).toString();
        double ratio = ((double) n)/((double) d);

        for (int i = 1; i < 10; i++){
            String iString = new Integer(i).toString();
            String NewN = nString.replaceFirst(iString,"");
            String NewD = dString.replaceFirst(iString,"");
            double check = Double.valueOf(NewN)/Double.valueOf(NewD);
            if (ratio == check & NewN.length() < 2 & NewD.length() < 2){
                temp = true;
                break;
            }
        }

        return temp;
    }

}
