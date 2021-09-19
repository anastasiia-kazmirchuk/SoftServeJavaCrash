package otherTasks.dateAfterToday;

//Write a method to get the date n-years m-months and k-days after today using new DateTime API.
//
//Return the obtained date in the format ISO_LOCAL_DATE.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class MyUtils {
    public static String getDateAfterToday(int years, int months, int days) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusYears(years).plusMonths(months).plusDays(days);
        return localDate.toString();
    }
}
