package test.jichu;


import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class testBigDecimal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println();

    }

    private static Boolean getOrFalse(Collection list, int size){
        if (list.size() > size){
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }

//    private static T getOrNull(List<T> list, int size){
//        if (list.size() > size){
//            return list.get(size);
//        }else {
//            return null;
//        }
//    }
}
