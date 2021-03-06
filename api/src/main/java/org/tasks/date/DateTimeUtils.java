package org.tasks.date;

import java.util.Date;

public class DateTimeUtils {

    public static long currentTimeMillis() {
        return org.joda.time.DateTimeUtils.currentTimeMillis();
    }

    public static Date newDate() {
        return newDate(currentTimeMillis());
    }

    public static Date newDate(long date) {
        return new Date(date);
    }

    public static Date newDate(int year, int month, int day) {
        return new Date(year - 1900, month - 1, day);
    }

    public static Date newDate(int year, int month, int day, int hour, int minute, int second) {
        return new Date(year - 1900, month - 1, day, hour, minute, second);
    }

    public static Date newDateUtc(int year, int month, int day, int hour, int minute, int second) {
        return newDate(Date.UTC(year - 1900, month - 1, day, hour, minute, second));
    }

}
