/**
 * Created by Adam on 11/28/2014.
 */
public class Problem36 {

    public static void Solve(){

        int temp = 0;

        for (int i = 1; i < 1000000; i++){
            if (Func.IsPalindrome(Integer.toString(i,10)) & Func.IsPalindrome(Integer.toString(i,2))){
                temp += i;
            }
        }

        System.out.println(temp);
    }


}
