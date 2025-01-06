package 代码随想录;

public class 二分查找 {
    public static void main(String[] args) {
        int[] ints = {1,3,8,9,20};
        System.out.println(method1(ints, 21));
        System.out.println(method2(ints, 11));
    }

    //左闭右开
    private static int method1(int[] ints, int target){
        int l = 0; int r = ints.length;
        while (l < r){
            int mid = (l + r)/2;
            if (ints[mid] > target){
                r = mid;
            } else if (ints[mid] < target) {
                l = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //左闭右闭
    private static int method2(int[] ints, int target){
        int l = 0; int r = ints.length -1;
        while (l <= r){
            int mid = (l + r)/2;
            if (ints[mid] > target){
                r = mid-1;
            } else if (ints[mid] < target) {
                l = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
