package _24Array;

/*
    二维数组的遍历
 */
public class _10ArrayTest {
    public static void main(String[] args) {
        //二维数组
        int[][] a1 = {{1, 2, 3}, {4, 5, 6, 7}, {0}};
        for(int i = 0; i < a1.length; i++) {
            System.out.println("=================");
            for(int j = 0; j < a1[i].length; j++) {
                System.out.printf("数组第%d行%d个是%d\n", i + 1, j + 1, a1[i][j]);

            }
        }
    }
}
