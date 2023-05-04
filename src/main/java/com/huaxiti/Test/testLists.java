package com.huaxiti.Test;

import java.util.*;

public class testLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("sssss");
        list.add("aaaa");
        list.add(null);
        list.add(null);
        System.out.println(list);

        Set s = new HashSet();
        s.add("ddddd");
        s.add("ddddd");
        s.add("bbbbbb");
        s.add(null);
        s.add(null);
        System.out.println(s);

        Map m = new HashMap();
        m.put(1,"aaaa");
        m.put(2,"bbbb");
        m.put(null,"fff");
        m.put(null,"bbbb");
        System.out.println(m);

        String b = "fffFfVf";
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
    }
}
