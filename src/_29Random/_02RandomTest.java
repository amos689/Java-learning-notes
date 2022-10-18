package _29Random;

import java.util.*;

/*
    编写程序, 生成5个不重复的(0 - 100)随机数, 重复的话重新生成
    最终生成的5个随机数放到数组中
 */
public class _02RandomTest {
    public static void main(String[] args) {
        //准备一个长度为5的一维数组
        int[] arr = new int[] {-1, -1, -1, -1, -1}; //默认值为负一
        //循环, 生成随机数
        Random rand = new Random();
        for(int i = arr.length - 1; i >= 0; i--) {
            while(true) {
                int temp = rand.nextInt(0, 101);
                if(judge(arr, temp)) {
                    arr[i] = temp;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean judge(int[] arr, int a) {
        //对数组进行排序
        Arrays.sort(arr);
        //进行二分查找
        return Arrays.binarySearch(arr, a) < 0 ? true : false;
    }
}
