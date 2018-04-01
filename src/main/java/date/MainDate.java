package date;

import sun.util.locale.provider.CalendarDataUtility;

import java.time.Clock;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

public class MainDate {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        TemporalAccessor date = DateTimeFormatter
                .ofPattern("DD MM YYYY", Locale.US)
                .parse("12 12 2018");
        System.out.println(date);
        System.out.println(Date.from(Instant.now()));
        System.out.println(CalendarDataUtility.FIRST_DAY_OF_WEEK);

    }
}
