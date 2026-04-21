package com.pluralsight;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        String formatted1 = format1.format(currentDate);
        System.out.println(formatted1);

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted2 = format2.format(currentDate);
        System.out.println(formatted2);

        SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd, yyyy");
        String formatted3 = format3.format(currentDate);
        System.out.println(formatted3);

        SimpleDateFormat format4 = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm");
        format4.setTimeZone(TimeZone.getTimeZone("GMT"));
        String formatted4 = format4.format(currentDate);
        System.out.println(formatted4);

        SimpleDateFormat format5 = new SimpleDateFormat("h:mm on dd-MMM-yyyy");
        String formatted5 = format5.format(currentDate);
        System.out.println(formatted5);
    }
}
