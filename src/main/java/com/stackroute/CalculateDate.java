package com.stackroute;
import java.util.*;
import java.text.*;

public class CalculateDate {
    public boolean startDate() {
            Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
            System.out.println(df.format(c.getTime()));
            String s1 = df.format(c.getTime());
            if (s1.equals("Mon 06/05/2019"))
                return true;
            else
                return false;

        }

        public boolean endDate () {
            Calendar c = Calendar.getInstance();
            String s3 ="";
// Set the calendar to monday of the current week
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
            c.add(Calendar.DATE, 6);
            //  System.out.println( c.add(Calendar.DATE,1));
            s3 = (df.format(c.getTime()));
            if (s3.equals("Sun 12/05/2019"))
                return true;
            else
                return false;

        }
    }


