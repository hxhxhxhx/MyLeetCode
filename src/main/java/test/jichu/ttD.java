package test.jichu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * java流式处理练习
 * Created by baxter on 2024/06/27.
 */
public class ttD {

    public static void main(String[] args) {
        int[] ints = new int[]{1,4,6,9,3,0,5,4};

        //冒泡排序
//        System.out.println(Arrays.toString(mp(ints)));
        //选择排序
//        System.out.println(Arrays.toString(xz(ints)));
        //插入排序
//        System.out.println(Arrays.toString(cr(ints)));
        //堆排序
//        System.out.println(Arrays.toString(HeapSort(ints)));
        //归并排序
//        System.out.println(Arrays.toString(gbSort(ints)));
        //希尔排序
        System.out.println(Arrays.toString(shellSort(ints)));
    }

    private static int[] mp(int[] ints){
        for (int i = 0; i < ints.length; i++){
            for (int j = 0; j < ints.length -1-i; j++){
                if (ints[j] > ints[j+1]){
                    int temp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        return ints;
    }

    private static int[] xz(int[] ints){

        for (int i = 0; i < ints.length; i++){
            int min = i;
            for (int j = i; j < ints.length; j++){
                if (ints[j] < ints[min]){
                    min = j;
                }
            }
            int temp = ints[i];
            ints[i] = ints[min];
            ints[min] = temp;
        }
        return ints;
    }

    private static int[] cr(int[] ints){
        for (int i = 1; i < ints.length; i++){
            int j = i;
            int val = ints[j];
            while(j > 0 && val < ints[j-1]){
                ints[j] = ints[j-1];
                j--;
            }
            ints[j] = val;
        }
        return ints;
    }

    private static int length;
    private static int[] HeapSort(int[] ints){
        length = ints.length;
        for (int i = length - 1; i >= 0; i--){
            Heaps(ints,i);
        }

        for (int i = length -1; i > 0; i--){
            Swap(ints,length-1,0);
            length--;
            Heaps(ints,0);
        }
        return ints;
    }

    //选出子树中最大节点
    private static void Heaps(int[] ints, int largest){
        int l = largest * 2 + 1; int r = largest * 2 + 2; int temp = largest;
        if (l < length && ints[l] > ints[largest]){
            largest = l;
        }
        if (r < length && ints[r] > ints[largest]){
            largest = r;
        }
        if (largest != temp){
            Swap(ints,largest,temp);
            Heaps(ints,largest);
        }
    }

    private static void Swap(int[] ints, int l, int r){
        int temp = ints[l];
        ints[l] = ints[r];
        ints[r] = temp;
    }

    public static int[] gbSort(int[] ints){
        int len = ints.length;
        if (len < 2){
            return ints;
        }
        int mid = len / 2;
        return merge(gbSort(Arrays.copyOfRange(ints,0,mid)),gbSort(Arrays.copyOfRange(ints,mid,len)));
    }

    private static int[] merge(int[] leftRange, int[] rightRange){
        int leftLen = leftRange.length;
        int rightLen = rightRange.length;
        int leftInx = 0; int rightInx = 0; int index = 0;
        int[] result = new int[leftLen+rightLen];
        while (leftInx < leftLen && rightInx < rightLen){
            if (leftRange[leftInx] < rightRange[rightInx]){
                result[index++] = leftRange[leftInx++];
            }else {
                result[index++] = rightRange[rightInx++];
            }
        }
        while (leftInx < leftLen){
            result[index++] = leftRange[leftInx++];
        }
        while (rightInx < rightLen){
            result[index++] = rightRange[rightInx++];
        }
        return result;
    }

//    public static int[] shellSort(int[] ints){
//        int len = ints.length;
//        for (int mid = len / 2; mid > 0; mid /= 2){
//            for (int i = mid; i < len; i++){
//                int j = i - mid;
//                while(j >= 0 && ints[j] > ints[i]){
//                    ints[j + mid] = ints[j];
//                    j -= mid;
//                }
//                ints[j] = ints[i];
//            }
//        }
//        return ints;
//    }

    public static int[] shellSort(int[] arr) {
        int len = arr.length, tmp, j;
        for (int gap = len / 2; gap >= 1; gap = gap / 2) {
            for (int i = gap; i < len; i++) {
                tmp = arr[i];
                j = i - gap;
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
        }
        return arr;
    }

}
