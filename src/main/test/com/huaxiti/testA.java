package com.huaxiti;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huaxiti.DesignModle.Director.Director;
import com.huaxiti.DesignModle.Director.Product;
import com.huaxiti.DesignModle.Director.Worker;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import okhttp3.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testA {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @Test
    public void testHttp() throws IOException {
            Map<String, Object> map = new HashMap<>();
            HashMap<String, Object> body = new HashMap<>();
            body.put("url", "https://zhjy.tuling.com.cn/f/3Vs8/strimzi-0.31.1.tar.gz");
//            body.put("filename", "鎸囧畾涓撲笟txt");
            body.put("static", true);
            Request request = new Request.Builder()
                    .post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new ObjectMapper().writeValueAsString(body)))
                    .url("https://pkqa.com.cn/oss/link")
                    .build();

            try (Response response = new OkHttpClient().newCall(request).execute()) {
                if (response.body() != null) {
                    String bodyStr = response.body().string();
//                    log.info("getWorkScore[{}] response: {}", response.request().url().query(), bodyStr);
                    //获取成功
                    HashMap<String,Object> hashMap = new ObjectMapper().readValue(bodyStr, HashMap.class);
                    System.out.println(hashMap);
                    HashMap data = (HashMap)hashMap.get("data");
                    if(data.get("token") != null){
                        System.out.println(data);
                    }
                }
                log.error("getWorkScore request error, path: {}, code: {}, body: {}",
                        request.url().query(), response.code(), response.body().string());
                System.out.println(map);

            }
    }



    public static void main(String[] args) {
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        HashMap<String, Integer> branchMap = new HashMap<>();
        branchMap.put("1",1);
        branchMap.put("2",2);
        branchMap.put("3",3);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");
        try {

            for (String s1 : list1){

                for (String s2 : list2){
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("list1",s1);
                    map.put("list2",s2);
                    list.add(map);
                }
            }
        }catch (Exception e){

        }
        System.out.println(list1.stream().mapToInt(branchMap::get).sum());
        System.out.println((int)3.0);
    }

    @Test
    public void test(){
        List<HashMap<String,Object>> collect1 = new ArrayList<>();
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("graduateYear","2020届");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("graduateYear","2021届");
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("graduateYear","2023届");
        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("graduateYear","2022届");
        collect1.add(map1);
        collect1.add(map2);
        collect1.add(map2);
        collect1.add(map3);
        collect1.add(map4);
        collect1.add(map4);
        ArrayList<String> gList = collect1.stream().map(m -> String.valueOf(m.get("graduateYear"))).distinct().sorted(String::compareTo).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(gList);
        StringBuffer sb = new StringBuffer();
        sb.append("sss");
        sb.append(System.getProperty("line.separator"));
        sb.append("ddd");
        System.out.println("========="+sb.toString());
        HashMap<String, String> map = new HashMap<>();
        map.put("1",sb.toString());
        System.out.println(map);

        long current = System.currentTimeMillis();
        long time = 1693986180000L;
        System.out.println("current："+current);
        System.out.println("time："+time);
        long minute = (time-current)/60/1000;
        System.out.println("minute："+minute);

        double dd = 6.4;
        double zx = (long)dd;
        double doublePart = new BigDecimal(String.valueOf(new Double(dd))).subtract(new BigDecimal(zx)).doubleValue();
        System.out.println(doublePart);

        HashMap<String, List<String>> mappp = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ss");
        mappp.put("1",list1);
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("1");
        resultList.add("2");
        for (String s : resultList){
            if (mappp.get(s) == null){
                System.out.println("null");
                continue;
            }
            if (mappp.get(s).size() == 1){
                System.out.println("1");
            }
            if (mappp.get(s).size() == 0){
                System.out.println("0");
            }
        }

        long big = 210000000000L;
        Long.parseLong(String.valueOf(big));
        System.out.println(new Long(big).intValue() > 0 ? 1 : -1);
        System.out.println(big > 0 ? 1 : -1);
    }

    @Test
    public void getTime1() {
        long timestamp = 1693377720000L;
        // 创建一个 Calendar 实例，并设置其时间为给定时间戳所表示的时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        // 设置时间为当天的 24 点
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // 获取设置后的 Calendar 对应的 Date 对象
        Date date = calendar.getTime();

        // 获取 Date 对象的时间戳
        System.out.println(date.getTime());

    }

    @Test
    public void getTime() {
        // 假设你有一个时间戳，单位为毫秒
        long timestamp = System.currentTimeMillis();

        // 创建一个 Calendar 实例，并设置其时间为当前时间
        Calendar currentCalendar = Calendar.getInstance();

        // 创建另一个 Calendar 实例，并设置其时间为给定时间戳
        Calendar timestampCalendar = Calendar.getInstance();
        timestampCalendar.setTimeInMillis(1694938807000L);

        // 比较年、月、日是否相同
        boolean isSameDate = currentCalendar.get(Calendar.YEAR) == timestampCalendar.get(Calendar.YEAR) &&
                currentCalendar.get(Calendar.MONTH) == timestampCalendar.get(Calendar.MONTH) &&
                currentCalendar.get(Calendar.DAY_OF_MONTH) == timestampCalendar.get(Calendar.DAY_OF_MONTH);

        if (isSameDate) {
            System.out.println("The timestamp corresponds to the current date.");
        } else {
            System.out.println("The timestamp does not correspond to the current date.");
        }
    }

    @Test
    public void getToday24(){
        //获得当天24点时间戳
        // 假设你有一个时间戳，单位为毫秒
        long timestamp = System.currentTimeMillis();

        // 创建一个 Calendar 实例，并设置其时间为给定时间戳所表示的时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        // 设置时间为当天的 24 点
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        // 获取设置后的 Calendar 对应的 Date 对象
        Date date = calendar.getTime();

        // 获取 Date 对象的时间戳
        long timestampAt24 = date.getTime();

        System.out.println("Original Timestamp: " + timestamp);
        System.out.println("Timestamp at 24:00: " + timestampAt24);
    }

    @Test
    public void getMonthFirstAndEnd(){
        //获得月初和月末时间戳
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1696089600000L);
        Date currentDate = calendar.getTime();

        // 设置为当前月份初的日期
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date firstDayOfMonth = calendar.getTime();

        // 设置为下个月份初的日期，然后减去一天，即为当前月份末的日期
        calendar.add(Calendar.MONTH, 1);
        Date lastDayOfMonth = calendar.getTime();

        // 转换为时间戳
        long currentTimestamp = currentDate.getTime();
        long firstDayOfMonthTimestamp = firstDayOfMonth.getTime();
        long lastDayOfMonthTimestamp = lastDayOfMonth.getTime();

        System.out.println("当前时间戳: " + currentTimestamp);
        System.out.println("当前月份初时间戳: " + firstDayOfMonthTimestamp);
        System.out.println("当前月份末时间戳: " + lastDayOfMonthTimestamp);

    }


    @Test
    public void getTimeMillis() throws ParseException {
//        将指定格式的时间转换为时间戳：
        String time = "2023-10-13 15:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        Date date = format.parse(time);
        Long time1 = date.getTime();


        System.out.println("当前时间戳: " + time1);
        System.out.println("当前时间: " + date);

    }
}
