package com.huaxiti.LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class L648 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("a");
        li.add("b");
        li.add("c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWords(li, sentence));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] sentenceList = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sentenceList.length; i ++){
            for (String dic : dictionary){
                String sen = sentenceList[i];
                if (sentenceList[i].length() > dic.length()) {
                    sen = sentenceList[i].substring(0, dic.length());
                }
                if(sen.equals(dic) && sentenceList[i].length() > sen.length()){
                    sentenceList[i] = sen;
                }
            }
            sb.append(sentenceList[i]).append(" ");
        }
        String res = sb.toString();
        return res.substring(0,res.length());
    }
}

