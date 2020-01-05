package com.fanap.podNeshan.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 9/22/2019.
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

    public static String localDateTimeToString(LocalDateTime localDateTime) {
        if (localDateTime == null)
            return null;
        return localDateTime.getYear() + "/" + localDateTime.getMonthValue() + "/" +
                localDateTime.getDayOfMonth() + " " + localDateTime.getHour() + ":" +
                localDateTime.getMinute() + ":" + localDateTime.getSecond();
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


    public static List<String> doubleToString(List<Double> aDouble) {
        if (aDouble == null)
            return null;
        List<String> stringList = new ArrayList<>();
        for (Double element : aDouble) {
            if (element != null)
                stringList.add(element.toString());
        }
        return stringList;
    }


}
