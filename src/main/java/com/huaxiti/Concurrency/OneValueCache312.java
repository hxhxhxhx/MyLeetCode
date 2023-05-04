package com.huaxiti.Concurrency;

import java.math.BigInteger;
import java.util.Arrays;

public class OneValueCache312 {
    private final Integer lastNumber;
    private final Integer[] lastFactors;

//    public OneValueCache312(Integer i, Integer[] factors) {
    public OneValueCache312(Integer i, Integer[] factors) {
        lastNumber = i;
        lastFactors = Arrays.copyOf(factors,factors.length);
    }

    public Integer[] getFactors(Integer i){
        if (lastNumber == null || !lastNumber.equals(i)){
            return null;
        }else {
            return Arrays.copyOf(lastFactors,lastFactors.length);
        }
    }
}

class OneValueCasheImpl{
    public static void main(String[] args) {
        Integer[] i = {1,2,3};
        OneValueCache312 oneValueCache312 = new OneValueCache312(1, i);
        Integer[] factors = oneValueCache312.getFactors(2);
        System.out.println(Arrays.toString(factors));
        Integer[] i1 = {1,2,4};
        OneValueCache312 oneValueCache3121 = new OneValueCache312(2, i1);
        Integer[] factors1 = oneValueCache3121.getFactors(2);
        System.out.println(Arrays.toString(factors1));
    }
}
