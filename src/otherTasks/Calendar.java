package otherTasks;

import java.util.Date;
import java.util.TimeZone;

public class Calendar {
    public static java.util.Calendar convertDateToCalendar(Date date) {


        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));  // за допомогою цього методу змінюємо часовий пояс
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);

        return calendar;

    }
}
