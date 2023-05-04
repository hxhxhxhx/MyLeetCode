package test.jichu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testDate {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(date.format(new Date()));
    }
}
