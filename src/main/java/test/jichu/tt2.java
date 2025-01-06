package test.jichu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class tt2 implements tt{

    @Override
    public void test(String type) {
        System.out.println("tt2");
        if ("1".equals(type)) {
            System.out.println("1");
        }
        if ("2".equals(type)) {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        t1();
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.get(0);
        list.get(1);

    }

    public static void t1(){
        long aimTime = getAimTime(null, null, -1, 0, 0, 0);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        String lastDay = format.format(new Date(aimTime));
        System.out.println(lastDay);
    }

    public static long getAimTime(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second){
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
