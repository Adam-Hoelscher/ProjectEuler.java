/**
 * Created by Adam on 11/28/2014.
 */
public class Problem21 {

    public static void Solve() {
        int maxTest = 10000;
        int temp = 0;
        int[] DList = ListD(maxTest);
        for (int i = 1; i <= maxTest; i++){
            int q = DList[i];
            if (q < maxTest + 1){
                if (DList[q]==i & q != i){
                    temp+=i;
                }
            }
        }
        System.out.println(temp);
    }

    private static int[] ListD(int maxTest){
        int[] temp = new int[maxTest+1];
        for (int iCount = 1; iCount <= maxTest; iCount++){
            temp[iCount] = GetD(iCount);
        }
        return temp;
    }

    private static int GetD(int n){
        int temp = 0;
        for (int f = 1; f < n; f++){
            if (n%f==0){temp+=f;}
        }
        return temp;
    }

}
