import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class DateCalendarTest {
    @Test
    public void date_format_test() throws Exception {
        Date date = new Date(2017 - 1900, 7, 10, 0, 0, 0);
        System.out.println(date);
        System.out.println(date.getTimezoneOffset());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String a = simpleDateFormat.format(date);
        System.out.println(simpleDateFormat.getTimeZone());
        assertEquals("2017-08-10 00:00:00", a);
    }

    @Test
    public void get_timezones() throws Exception {
        System.out.println(StringUtils.join(TimeZone.getAvailableIDs(), "\r\n"));
    }

    @Test
    public void calender_test() throws Exception {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.set(2017, 7, 10, 0, 0, 0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(instance.getTime());
        assertEquals("2017-08-10 08:00:00", format);
        int[] weekends = {Calendar.SUNDAY, Calendar.SATURDAY};
        assertEquals(false, ArrayUtils.contains(weekends, instance.get(Calendar.DAY_OF_WEEK)));
    }

    @Test
    public void java_time() throws Exception {
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println(localDate.toString());
    }
}
