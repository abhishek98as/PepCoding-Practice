import java.util.*;
import java.text.*;

public class java_date_function {
    public static void main(String[] args) {


        Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week in text:"+dayWeekText);
    }
}
