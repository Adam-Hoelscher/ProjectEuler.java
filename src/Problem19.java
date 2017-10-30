/**
 * Created by Adam on 11/28/2014.
 */
public class Problem19 {

    public static void Solve() {
        int q = 0;
        int iCount = 0;
        while (DateArr(iCount)[0] < 2001){
            if (DateArr(iCount)[2]==1 & (iCount%7)==0){
                q++;
            }
            iCount++;
        }
        System.out.println(q);
    }

    private static int[] DateArr(int Serial){
        int Year = 1901;
        int Month = 1;
        int Day = 1;
        int[] temp = new int[3];
        for (int i = 0; i < Serial; i++){
            Day++;
            if (Day > DaysInMonth(Month, Year)){
                Day = 1;
                Month++;
                if (Month > 12){
                    Month = 1;
                    Year++;
                }
            }
        }
        temp[0] = Year;
        temp[1] = Month;
        temp[2] = Day;
        return temp;
    }

    private static int DaysInMonth(int Month, int Year){
        int q = 0;
        switch(Month){
            case 1:
                q = 31;
                break;
            case 2:
                q = 28;
                if (Year % 4 == 0){q++;}
                break;
            case 3:
                q = 31;
                break;
            case 4:
                q = 30;
                break;
            case 5:
                q = 31;
                break;
            case 6:
                q = 30;
                break;
            case 7:
                q = 31;
                break;
            case 8:
                q = 31;
                break;
            case 9:
                q = 30;
                break;
            case 10:
                q = 31;
                break;
            case 11:
                q = 30;
                break;
            case 12:
                q = 31;
                break;
        }
        return q;
    }

}
