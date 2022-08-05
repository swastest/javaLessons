package my;


import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TimeDataLesson {

@Test
    void test01(){
    // Сейчас = 2019-02-22T09:49:19.275039200
    LocalDateTime time = LocalDateTime.now();
    System.out.println("Сейчас = " + time);
    System.out.println("=======");

    Instant instant0 = Instant.now();
    instant0.toEpochMilli();
    System.out.println(instant0);
}

@Test
    void test02(){
    Calendar c = Calendar.getInstance();

    Long epoch = System.currentTimeMillis();
    c.setTimeInMillis(epoch);
    c.add(Calendar.DATE,1);
    Long epochPlus = c.getTimeInMillis();
    System.out.println(epoch);
    System.out.println("===="+epochPlus);

    Date date = new Date();

    c.setTime(date);
    c.add(Calendar.DATE, 1);
    Date nextDate = c.getTime();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String td = dateFormat.format(nextDate);
    System.out.println(td);


}

}
