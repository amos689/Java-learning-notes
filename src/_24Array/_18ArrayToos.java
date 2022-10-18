package _24Array;

import java.util.Arrays;


/*
    好消息:
        SUN公司已经为我们写好了一个数组工具类: java.util.Arrays
        所有方法都是静态的, 直接用类名调用
        最常用的就是两个方法: 查找和排序
        看文档, 别死记硬背
        IDEA自动导入: alt + enter
 */
public class _18ArrayToos {
    public static void main(String[] args) {
        //java.util.Arrays工具类中有哪些方法, 我们开发当中需要参考API文档
        int[] arr = {3, 6, 5, 12, 1, 2, 32, 5, 5};

        //排序
        Arrays.sort(arr);
        //输出
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        //二分查找
        int index = Arrays.binarySearch(arr, 4);
        System.out.println(index <= -1 ? "不存在" : "存在, 下标是: " + index);

    }
}
