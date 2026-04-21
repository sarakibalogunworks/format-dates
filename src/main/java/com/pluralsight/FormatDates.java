package com.pluralsight;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        String formatted1 = format1.format(currentDate);
        System.out.println(formatted1);

    }
}
