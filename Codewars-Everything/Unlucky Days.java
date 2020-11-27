import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kata {
    public static int unluckyDays(int year) {
        int cout = 0;
        int z = 0;
        LocalDate years;
        years = LocalDate.ofYearDay(year, 2);
        if (years.isLeapYear()) {
            z = 356;
        } else z = 355;
        for (int i = 1; i < z; i++) {
            LocalDate time;
            time = LocalDate.ofYearDay(year, i);
            if (time.getDayOfWeek().equals(DayOfWeek.FRIDAY) && time.getDayOfMonth() == 13) {
                cout++;
            }
        }
        return cout;
    }
}
