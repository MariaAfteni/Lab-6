package MVP;

import static java.lang.System.out;

public class Date {

    public int display_day(int weekday ){
        String week_day="";
        weekday ++;

        switch (weekday) {
            case 2 -> week_day = "Monday";
            case 3 -> week_day = "Tuesday";
            case 4 -> week_day = "Wednesday";
            case 5 -> week_day = "Thursday";
            case 6 -> week_day = "Friday";
        }

        if (weekday > 6){
            weekday = 1;
        }

        out.print("\n" + week_day  + " ");
        return weekday;
    }
}
