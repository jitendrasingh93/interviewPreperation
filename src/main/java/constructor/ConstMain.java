package constructor;

/**
 * Created by jeetu on 23/08/17.
 */

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ConstMain {

    public static void main(String[] args) {

        SubConstructor s = new SubConstructor();


            // prints "Sep 6, 2009"
            DateFormat dateInstance = SimpleDateFormat.getDateInstance();
            System.out.println(dateInstance.format(Calendar.getInstance().getTime()));

            // prints "9:03:20 PM"
            DateFormat timeInstance = SimpleDateFormat.getTimeInstance();
            System.out.println(timeInstance.format(Calendar.getInstance().getTime()));

            // prints "Sep 6, 2009 9:03:20 PM"
            DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
            System.out.println(dateTimeInstance.format(Calendar.getInstance().getTime()));

        }
    }
