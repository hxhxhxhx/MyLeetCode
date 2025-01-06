package 代码随想录;

public class 移除元素 {
    public static void main(String[] args) {
        int[] ints = {1,1,1};
        System.out.println(method(ints, 3));
    }

    private static int method(int[] ints, int target){
        int l = 0; int r = ints.length-1;
        while (r >= 0 && ints[r] == target){
            r--;
        }
        if (r < 0){
            return 0;
        }
        for (;l <= r; l++){
            if (l == r && ints[l] == target){
                return l-1;
            }
            if (ints[l] == target){
                int temp = ints[l];
                ints[l] = ints[r];
                ints[r] = temp;
                r--;
            }

        }
        return l;
    }
}
