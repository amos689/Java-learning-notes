package _24Array;

import java.util.Arrays;

public class _14ArraysTool {
    public static void main(String[] args) {
        int[] arr = {2, 34, 1, 53, 66, 23, 0, 54, 82, 21};
        // 工具类的大部分方法是静态的
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
