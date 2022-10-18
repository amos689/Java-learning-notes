package _24Array;

/*
    关于Java中的二维数组
        1.二维数组就是一个特殊的一维数组, 特殊在这个一维数组中的每个元素都是一个一维数组
        2.什么是三维数组: 是一个特殊的二维数组, 这个二维数组中每个元素都是一个数组
        3.二维数组初始化
            int[][] array = {{1, 2}, {3, 4, 5}};
 */
public class _08ArrayTest {
    public static void main(String[] args) {
        //二维数组
        int[][] a1 = {{1, 2, 3}, {4, 5, 6, 7}, {0}};
        System.out.println(a1.length); //3: a1中有三个"元素"
        //a[0]: 指的是{1, 2, 3}
        System.out.println(a1[1].length); //4: a[1]元素的长度是4
    }
}
