package com.huaxiti.LeetCode100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 递归方法、
 * 树的遍历
 */
public class L17电话号码的字母组合 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("34"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        if(digits.length() == 0) return list;
        returnback(digits,list,map,0,sb);
        return list;
    }

    public static void returnback(String digits,List<String> list,Map<Integer,String> map,int index,StringBuffer sb){
        if (digits.length()==index){
            list.add(sb.toString());
        }else {
            String s = map.get(Integer.parseInt(String.valueOf(digits.charAt(index))));
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
                returnback(digits, list, map, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
