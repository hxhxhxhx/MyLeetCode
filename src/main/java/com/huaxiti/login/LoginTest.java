package com.huaxiti.login;


import com.huaxiti.LeetCode100.lisi;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;


public class LoginTest {
    private static Login login;
    public static void main(String[] args) throws CloneNotSupportedException {
        test();
        String a = "a";
        System.out.println("a".equals(a));
        System.out.println("a" == a);
        Object o = new Object();
        o.equals(a);
        a.compareTo("a");
        NumberFormat.getCurrencyInstance();
        NumberFormat n = null;
//        n.format(a);
        LocalDate.now();

        final Student s = new Student();
        s.name = "zhangsan";


        System.out.println(s.getName());
//        Student.age = 18;
        s.setAge(20);
        System.out.println(s.getAge());


        Student.age = 18;
        Student s1 = new Student();
        System.out.println(s1.getAge());
        System.out.println(s1.getName());

        zhangsan zhangsan = new zhangsan();
        StringBuffer sb = new StringBuffer();
        sb.append("abcvccccccccccccm");
        sb.append("abcvccccccccccccmm");
        sb.append("abcvccccccccccccm");
        sb.append("abcvccccccccccccmma");
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        System.out.println(sb.codePointAt(1));
        System.out.println(sb.codePointBefore(2));

        char[] value = new char[14];
        value[0] = 'a';
        value[1] = 'b';
        value[2] = 'c';
        System.out.println(Arrays.toString(value));

        final char[] values = value;
        int c = 2;

        values[c++] = 'n';
        values[c++] = 'u';
        values[c++] = 'l';
        values[c++] = 'l';

        System.out.println(Arrays.toString(values));

        Date date = new Date();
        LocalDate now = LocalDate.now();

        com.huaxiti.login.zhangsan z = new zhangsan();
        System.out.println(z.getHoby());
        lisi l = new lisi();
        Path p;
        Paths ps;

        Student zz = new Student("zz");
        String name = l.getName();
//        Object clone = zz.clone();
//        Object clone1 = l.clone();
        Object o1 = new Object();

    }


    public static void test(){
//        login.login();
    }
}
