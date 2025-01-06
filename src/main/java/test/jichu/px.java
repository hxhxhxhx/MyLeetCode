package test.jichu;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class px {
    public static void main(String[] args) throws InterruptedException {
        byte[] by = new byte[]{1,2,3};
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
        System.out.println(calendar.getTime());
        calendar.setTimeInMillis(System.currentTimeMillis());
        System.out.println(calendar.getTime());
        System.out.println(Arrays.toString(by));
        int[] ints = {0,3,2,8,5,6,4,1,0};
        //冒泡排序
//        System.out.println(Arrays.toString(mp(ints)));
//        System.out.println(Arrays.toString(mp1(ints)));
        //插入排序
//        System.out.println(Arrays.toString(cr(ints)));
        //选择排序
//        System.out.println(Arrays.toString(xz(ints)));
        //希尔排序
        //堆排序
//        System.out.println(Arrays.toString(dp(ints)));
        //归并排序
        System.out.println(Arrays.toString(dpx(ints)));
    }

    public static int[] mp(int[] ints){
        for (int i = 0; i < ints.length; i++){
            for (int j = ints.length-1; j > i; j--){
                if (ints[j] < ints[j-1]){
                    int temp = ints[j];
                    ints[j] = ints[j-1];
                    ints[j-1] = temp;
                }
            }
        }
        return ints;
    }

    public static int[] mp1(int[] ints){
        for (int i = ints.length-1; i >=0; i--){
            for (int j = 0; j < i; j++){
                if (ints[j] > ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        return ints;
    }

    public static int[] xz(int[] ints){
        for (int i = 0; i < ints.length-1; i++){
            int min = i;
            for (int j = i+1; j < ints.length; j++){
                if (ints[j] < ints[min]){
                    min = j;
                }
            }
            jh(ints,i,min);
        }
        return ints;
    }

    public static int[] cr(int[] ints){
        for (int i = 1; i < ints.length; i++){
            int j = i;
            int temp = ints[i];
            while(j >0 && temp < ints[j-1]){
                ints[j] = ints[j-1];
                j--;
            }
            ints[j] = temp;
        }
        return ints;
    }

    private static void jh(int[] ints, int l, int r){
        int temp = ints[l];
        ints[l] = ints[r];
        ints[r] = temp;
    }
    private static int len;
    public static int[] dp(int[] ints){
        len = ints.length;
        //排序
        for (int i = len-1; i >= 0; i--){
            px(ints,i);
        }
        //交换
        //排序
        for (int i = len-1; i > 0; i--){
            jh(ints,0, len-1);
            len--;
            px(ints,0);
        }
        return ints;
    }

    private static void px(int[] ints, int index){

        int left = index*2+1;int right = index*2+2;int largest = index;
        if (left < len && ints[left] > ints[largest]){
            largest = left;
        }
        if (right < len && ints[right] > ints[largest]){
            largest = right;
        }
        if (largest != index){
            jh(ints,index,largest);
            px(ints,largest);
        }
    }

    public static int[] gb(int[] ints){
        int len = ints.length;
        if (len < 2){
            return ints;
        }
        int mid = len/2;
        return bl(gb(Arrays.copyOfRange(ints,0,mid)),gb(Arrays.copyOfRange(ints,mid,len)));
    }

    private static int[] bl(int[] leftInts, int[] rightInts){
        int left = 0;int right = 0;int lLen = leftInts.length;
        int rLen = rightInts.length;
        int[] result = new int[lLen+rLen];
        int index = 0;
        while (left < lLen && right < rLen) {
            if (leftInts[left] < rightInts[right]) {
                result[index++] = leftInts[left++];
            }else {
                result[index++] = rightInts[right++];
            }
        }
        while (left < lLen){
            result[index++] = leftInts[left++];
        }
        while (right < rLen){
            result[index++] = rightInts[right++];
        }
        return result;
    }
    private static int l;
    public static int[] dpx(int[] ints){
        l = ints.length;
        for (int i = l-1; i >= 0; i--){
            ddd(ints,i);
        }
        for (int i = l-1; i > 0; i--){
            jh(ints,0,l-1);
            l--;
            ddd(ints,0);
        }
        return ints;
    }

    private static void ddd(int[] ints, int idx){
        int ll = idx*2+1; int r = idx*2+2; int largest = idx;
        if (ll < l && ints[ll] > ints[largest]){
            largest = ll;
        }
        if (r < l && ints[r] > ints[largest]){
            largest = r;
        }
        if (idx != largest){
            jh(ints,idx,largest);
            ddd(ints,largest);
        }
    }


}
