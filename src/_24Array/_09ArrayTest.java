package _24Array;

/*
    关于二维数组的读和改
        a[][]: 从左到右[]依次精确
        修改时注意不要越界
 */
public class _09ArrayTest {
    public static void main(String[] args) {
        //二维数组
        int[][] a1 = {{1, 2, 3}, {4, 5, 6, 7}, {0}};
        //取出二维数组中的第一个元素(是一个一维数组)
        int[] a2 = a1[0];
        //取出二维数组的第一个数据
        int a3 = a1[0][0];
        //取出第二个一维数组中第三个元素
        System.out.println("取出第二个一维数组中第三个元素: " + a1[1][2]);
        //更改第二个一维数组中的第三个元素
        a1[1][2] = 100;
        System.out.println("取出第二个一维数组中第三个元素: " + a1[1][2]);

    }
}
