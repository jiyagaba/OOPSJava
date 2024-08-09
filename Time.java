public class Time {
    public static void timeconverter(int totalSeconds) {
        int seconds_in_a_day = 24 * 60 * 60;
        int seconds_in_hour = 60 * 60;
        int seconds_in_min = 60;
        int day = totalSeconds / seconds_in_a_day;
        totalSeconds = totalSeconds % seconds_in_a_day;
        int hour = totalSeconds / seconds_in_hour;
        totalSeconds = totalSeconds % seconds_in_hour;
        int min = totalSeconds / seconds_in_min;
        int sec = totalSeconds % seconds_in_min;
        if (min >= 60) {
            int extraHours = min / 60;
            min = min % 60;
            hour += extraHours;
        }
        if (hour >= 24) {
            int extraDays = hour / 24;
            hour = hour % 24;
            day += extraDays;
        }

        System.out.println("Days is" + day);
        System.out.println("Hour is:" + hour);
        System.out.println("Min is:" + min);
        System.out.println("Sec is" + sec);

        // extraDays = 26 / 24 = 1
        // hour = 26 % 24 = 2
        // day += 1
        // extraHours = 120 / 60 = 2
        // min = 120 % 60 = 0
        // hour += 2

    }

    public static void main(String[] args) {
        int totalseconds = 253826;
        timeconverter(totalseconds);
    }
}
