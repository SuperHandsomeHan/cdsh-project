package com.bimda.cdshproject.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampUtil {
    public static String getCurrentTimeMillisName(){
        /**
         * 获取当前时间
         * 格式：yyyy-MM-dd-HH-mm-ss
         */
        String[] str = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()).toString().split("-");
        return String.valueOf(str[0] + str[1] + str[2]+str[3]+str[4]+str[5]);
    }
}
