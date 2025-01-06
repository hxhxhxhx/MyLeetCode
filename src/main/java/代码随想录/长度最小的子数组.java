package 代码随想录;

public class 长度最小的子数组 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,3,4,2};
        System.out.println(method(ints, 16));
    }

    private static int method(int[] ints, int target){
        int l = 0; int num = Integer.MAX_VALUE;
        int result = 0;
        for (int r = 0; r < ints.length; r++){
            result += ints[r];
            while (result >= target){
                num = Math.min(num,r-l+1);
                result -= ints[l++];
            }
        }
        return num == Integer.MAX_VALUE ? 0 : num;
    }
}
