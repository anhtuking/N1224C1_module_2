package oop_static.exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Chuyen doi chuoi thanh LocalDate
        String str1 = "20/10/2003";
        String str2 = "2003/07/26";

        LocalDate date1 = LocalDateUtil.parseDate_ddMMyyyy(str1);
        LocalDate date2 = LocalDateUtil.parseDate_yyyyMMdd(str2);

        System.out.println(date1);
        System.out.println(date2);

        // Chuyen doi LocalDate thanh chuoi
        LocalDate today = LocalDate.now();

        String formatDate1 = LocalDateUtil.toString_ddMMyyyy(today);
        String formatDate2 = LocalDateUtil.toString_yyyyMMdd(today);

        System.out.println(formatDate1);
        System.out.println(formatDate2);
    }
}
