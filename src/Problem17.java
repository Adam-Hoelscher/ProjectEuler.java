/**
 * Created by Adam on 11/27/2014.
 */
public class Problem17 {

    public static void Solve() {

        String s = "";
        for (int i = 1; i <= 1000; i++){
            s += Words(i);
        }
        System.out.println(s.replace(" ","").length());

    }

    private static String Words(int n){
        String s = "";
        if (n >= 1000) {
            s = s + Ones(n / 1000) + " thousand";
        }
        n = n % 1000;
        if (n >= 100) {
            s = s + Ones(n / 100) + " hundred";
        }
        n = n % 100;
        if (n!=0){
            if (s.length() != 0){
                s += " and ";
            }
            if (n<20 & n>9){
                s += Teens(n);
            } else {
                s += Tens(n/10);
                s += " ";
                n = n % 10;
                s += Ones(n);
            }
        }
        return s;
    }

    private static String Teens(int n){
        String s = "";
        switch (n){
            case 10: s = "ten"; break;
            case 11: s = "eleven"; break;
            case 12: s = "twelve"; break;
            case 13: s = "thirteen"; break;
            case 14: s = "fourteen"; break;
            case 15: s = "fifteen"; break;
            case 16: s = "sixteen"; break;
            case 17: s = "seventeen"; break;
            case 18: s = "eighteen"; break;
            case 19: s = "nineteen"; break;
        }
        return s;
    }

    private static String Tens(int n){
        String s = "";
        switch (n) {
            case 2: s = "twenty"; break;
            case 3: s = "thirty"; break;
            case 4: s = "forty"; break;
            case 5: s = "fifty"; break;
            case 6: s = "sixty"; break;
            case 7: s = "seventy"; break;
            case 8: s = "eighty"; break;
            case 9: s = "ninety"; break;
        }
        return s;
    }

    private static String Ones(int n){
        String s = "";
        switch (n) {
            case 1: s = "one"; break;
            case 2: s = "two"; break;
            case 3: s = "three"; break;
            case 4: s = "four"; break;
            case 5: s = "five"; break;
            case 6: s = "six"; break;
            case 7: s = "seven"; break;
            case 8: s = "eight"; break;
            case 9: s = "nine"; break;
        }
        return s;
    }

}
