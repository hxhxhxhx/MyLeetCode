package com.huaxiti;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class t1 {


    @Test
    public void t1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.subList(0, 1));
        System.out.println(list.subList(0, 2));


        long aimTime = getAimTime(null, -1, 0, 0, 0, 0);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
//        String lastDay = format.format(new Date(aimTime));
//        System.out.println(lastDay);
        System.out.println(new Date(aimTime));
    }

    public long getAimTime(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        // 设置为当前月份初的日期
        if (year != null){
            calendar.set(Calendar.YEAR,year);
        }
        if (month != null){
            calendar.set(Calendar.MONTH,month+2);
        }
        if (day != null){
            calendar.add(Calendar.DATE,day);
        }
        if (hour != null){
            calendar.set(Calendar.HOUR_OF_DAY,hour);
        }
        if (minute != null){
            calendar.set(Calendar.MINUTE,minute);
        }
        if (second != null){
            calendar.set(Calendar.SECOND,second);
        }
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime().getTime();
    }
}
