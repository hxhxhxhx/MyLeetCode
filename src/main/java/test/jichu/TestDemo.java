package test.jichu;



import com.sun.istack.internal.NotNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class TestDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        int num = 0;
        for (int i = 0; i < list.size(); i+=2) {
//            System.out.println(list.stream().skip(i).limit(2).collect(Collectors.toList()));
            System.out.println(num++);
        }
        System.out.println("????????");
        int a = 0;
        if (a == 1){
            System.out.println("1");
        } else if (a == 2) {
            System.out.println("2");
        }else {
            System.out.println("3");
        }
        long aimTime = getAimTime(null, -1, 1, 0, 0, 0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        String lastDay = format.format(new Date(aimTime));
        System.out.println(lastDay);
        System.out.println(aimTime);
        System.out.println(new Date(aimTime));
    }

    public static long getAimTime(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        // 设置为当前月份初的日期
        if (year != null){
            if (isAdd(year)){
                calendar.add(Calendar.YEAR, year);
            }else {
                calendar.set(Calendar.YEAR, year);
            }
        }
        if (month != null){
            if (isAdd(month)){
                calendar.add(Calendar.MONTH, month);
            }else {
                calendar.set(Calendar.MONTH, month);
            }
        }
        if (day != null){
            if (isAdd(day)){
                calendar.add(Calendar.DATE, day);
            }else {
                calendar.set(Calendar.DATE, day);
            }
        }
        if (hour != null){
            if (isAdd(hour)){
                calendar.add(Calendar.HOUR_OF_DAY, hour);
            }else {
                calendar.set(Calendar.HOUR_OF_DAY, hour);
            }
        }
        if (minute != null){
            if (isAdd(minute)){
                calendar.add(Calendar.MINUTE, minute);
            }else {
                calendar.set(Calendar.MINUTE, minute);
            }
        }
        if (second != null){
            if (isAdd(second)){
                calendar.add(Calendar.SECOND, second);
            }else {
                calendar.set(Calendar.SECOND, second);
            }
        }
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime().getTime();
    }

    @NotNull
    private static boolean isAdd(Integer year) {
        return String.valueOf(year).startsWith("+") || String.valueOf(year).startsWith("-");
    }
}

