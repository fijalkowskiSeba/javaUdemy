public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }

        final int HOURS_TO_MINUTES = 60;
        final int DAY_TO_HOURS=24;
        final int YEAR_TO_DAYS=365;

        long hours=minutes/HOURS_TO_MINUTES;
        //long restMinutes=minutes%HOURS_TO_MINUTES;
        long days=hours/DAY_TO_HOURS;
        hours=hours%DAY_TO_HOURS;
        long years=days/YEAR_TO_DAYS;
        days=days%YEAR_TO_DAYS;

        System.out.println(minutes + " min = "+years+" y and "+days+" d");
    }
}
