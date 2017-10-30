/**
 * Created by Adam on 11/27/2014.
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Func {

    static long Fact(long n){
        long q = 0;
        if (n < 2){
            q = 1;
        } else {
            q = n * Fact(n-1);
        }
        return q;
    }

    static long GCD(long a, long b) {
        if (b==0)
            return a;
        else
            return GCD(b, a % b);
    }

    static boolean HasUniqueNumerals(String s){
        boolean temp[] = new boolean[10];
        for (int i = 0; i < s.length(); i++){
            int val = Integer.valueOf(s.substring(i,i+1));
            if (temp[val]) return false;
            temp[val] = true;
        }
        return true;
    }

    static boolean IsPalindrome(String s) {
        int l = s.length();
        if (l < 2)
            return true;
        else if (s.substring(0,1).equals(s.substring(l-1,l)))
            return IsPalindrome(s.substring(1,l-1));
        else
            return false;
    }

    static boolean IsPandigital (String s){
        boolean temp = true;
        int l = s.length();
        for (int i = 1; i <= l; i++){
            if (s.replace(String.valueOf(i),"").length() + 1 != l) {
                temp = false;
                break;
            }
        }
        return temp;
    };

    static boolean IsPrime(long i) {
        for (long j = 2; j <= Math.sqrt(i); j++) {
            if (i%j==0)
                return false;
        }
        return true;
    }

    static long LCM(long a, long b) {
        return (a / GCD(a, b) * b);
    }

    static String readFile(String filename){
        String content = null;
        File file = new File(filename); //for ex foo.txt
        try {
            FileReader reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    static void writeFile(String content, String filename){
        File file = new File(filename); //for ex foo.txt
        try {
            FileWriter writer = new FileWriter(filename, false);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
