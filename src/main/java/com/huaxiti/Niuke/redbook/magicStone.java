package com.huaxiti.Niuke.redbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class magicStone {
    public static void main(String[] args) {

        System.out.println(test());
    }

    public static int test(){
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        List<String> list = new ArrayList<>();
        List<Integer> white = new ArrayList<Integer>();
        List<Integer> black = new ArrayList<Integer>();
        for (int s = 0; s < totalNum+1; s++){
            if (sc.hasNext()) {
                list.add(sc.nextLine());
            }
        }
        int first = 0;
        int second = 0;

        for(int s = 1; s < totalNum+1; s++){
            String l = list.get(s).substring(0,1);
            if (l.equals("1")){
                first++;
            }else if (l.equals("2")){
                second++;
            }else {
                white.add(Integer.parseInt(list.get(s).substring(2,3)));
                black.add(Integer.parseInt(list.get(s).substring(4,5)));
            }
        }
        int result = 0;
        int oldResult = 0;
        for (int i = 0; i < white.size(); i++) {
            result = 0;
            result += white.get(i);
            int z = 0;
            for (int j = 0; j < (totalNum/2-second)+1; j++) {

                if (j!=i) {
                    result += black.get(z);
                }
                z +=1;
            }
            if (i ==0){
                oldResult = result;
            }else {
                if (result<oldResult){
                    oldResult=result;
                }
            }

        }


        return result;
    }
}
