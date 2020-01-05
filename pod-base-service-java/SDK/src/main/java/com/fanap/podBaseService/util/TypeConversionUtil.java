package com.fanap.podBaseService.util;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shahab Askarian on 7/13/2019.
 */
public class TypeConversionUtil {

    public static String longToString(Long num) {
        if (num == null)
            return null;
        return Long.toString(num);
    }

    public static List<String> longToString(List<Long> longList) {
        if (longList == null)
            return null;
        List<String> stringList = new ArrayList<>();
        for (Long element : longList) {
            if (element != null)
                stringList.add(element.toString());
        }
        return stringList;
    }

    public static String decimalToString(BigDecimal num) {
        if (num == null)
            return null;
        return num.toString();
    }

    public static List<String> decimalToString(List<BigDecimal> bigDecimals) {
        if (bigDecimals == null)
            return null;
        List<String> stringList = new ArrayList<>();
        for (BigDecimal element : bigDecimals) {
            if (element != null)
                stringList.add(element.toString());
        }
        return stringList;
    }

    public static String intToString(Integer num) {
        if (num == null)
            return null;
        return Integer.toString(num);
    }

    public static List<String> intToString(List<Integer> ints) {
        if (ints == null)
            return null;
        List<String> stringList = new ArrayList<>();
        for (Integer element : ints) {
            if (element != null)
                stringList.add(element.toString());
        }
        return stringList;
    }


    public static String localDateTimeToString(LocalDateTime localDateTime) {
        if (localDateTime == null)
            return null;
        return localDateTime.getYear() + "/" + localDateTime.getMonthValue() + "/" +
                localDateTime.getDayOfMonth() + " " + localDateTime.getHour() + ":" +
                localDateTime.getMinute() + ":" + localDateTime.getSecond();
    }

    public static String localDateToString(LocalDate localDate) {
        if (localDate == null)
            return null;
        return localDate.getYear() + "/" + localDate.getMonthValue() + "/" +
                localDate.getDayOfMonth();
    }

    public static String booleanToString(Boolean b) {
        if (b == null)
            return null;
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String doubleToString(Double aDouble) {
        if (aDouble == null)
            return null;
        return aDouble.toString();
    }

    public static String toShamsi(int gy, int gm, int gd) {
        int[] g_d_m = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int jy;
        if (gy > 1600) {
            jy = 979;
            gy -= 1600;
        } else {
            jy = 0;
            gy -= 621;
        }
        int gy2 = (gm > 2) ? (gy + 1) : gy;
        int days = (365 * gy) + ((int) ((gy2 + 3) / 4)) - ((int) ((gy2 + 99) / 100)) + ((int) ((gy2 + 399) / 400)) - 80 + gd + g_d_m[gm - 1];
        jy += 33 * ((int) (days / 12053));
        days %= 12053;
        jy += 4 * ((int) (days / 1461));
        days %= 1461;
        if (days > 365) {
            jy += (int) ((days - 1) / 365);
            days = (days - 1) % 365;
        }
        int jm = (days < 186) ? 1 + (int) (days / 31) : 7 + (int) ((days - 186) / 30);
        int jd = 1 + ((days < 186) ? (days % 31) : ((days - 186) % 30));
        int[] out = {jy, jm, jd};
        String result = "";
        for (int i = 0; i < out.length - 1; i++) {
            result = result + out[i] + "/";
        }
        result = result + out[2];
        return result;
    }


//public boolean checkRegex(String string,String regex){
//
//}
}
