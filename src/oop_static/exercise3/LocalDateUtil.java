package oop_static.exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    public static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // Chuyen doi chuoi voi dinh dang dd/MM/yyyy sang LocalDate
    public static LocalDate parseDate_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    // Chuyen doi chuoi voi dinh dang yyyy/MM/dd sang LocalDate
    public static LocalDate parseDate_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    // Chuyen doi LocalDate sang dinh dang chuoi dd/MM/yyyy
    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }

    // Chuyen doi LocalDate sang dinh dang chuoi yyyy/MM/dd
    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
