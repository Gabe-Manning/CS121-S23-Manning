import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RentalFee {
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public double calcRentalFee(double rate, String pickup, String returndate) {
        int days = 0;
        try {
            Date date1 = dateFormat.parse(pickup);
            Date date2 = dateFormat.parse(returndate);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return rate * days;
    }
}
