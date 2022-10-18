package _24Array;

/*
    动态初始化二维数组
 */
public class _11ArrayTest {
    public static void main(String[] args) {
        //三行四列
        int[][] array = new int[3][4];
        //传递初始化数组
        format(array);
        //数组遍历
        //发现函数之间是传递的地址
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static void format(int[][] a) {
        int n = 1;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = n;
                n++;
            }
        }

    }
}
