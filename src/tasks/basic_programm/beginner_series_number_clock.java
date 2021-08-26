package tasks.basic_programm;

public class beginner_series_number_clock {


    public static void main(String[] args) {
        System.out.println(Clock.Past(2,3,30));
    }

    public class Clock
    {
        public static int Past(int h, int m, int s)
        {
            return h * 3600000 + m * 60000 + s * 1000;

        }
    }
    }
