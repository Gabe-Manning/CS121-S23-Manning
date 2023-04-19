import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calories {

    private DateFormat totalCalories = new SimpleDateFormat("MM/dd/yyyy");

    public double calcCalories(double calories, String startday, String endday) {
        int days = 0;
        try {
            Date date1 = totalCalories.parse(startday);
            Date date2 = totalCalories.parse(endday);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calories * days;
    }
}