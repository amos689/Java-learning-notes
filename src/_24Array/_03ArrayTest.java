package _24Array;

public class _03ArrayTest {
    public static void main(String[] args) {
        //第一种方法
        int[] x = {1, 2, 3, 4};
        printArray(x);
        //第二种方法
        int[] y = new int[2];
        printArray(y);
        //第三种方法(传递一个动态数组)
        printArray(new int[4]);

        //第四种方法(传递一个静态数组)
        printArray(new int[]{1, 2, 3}); //[]里面不要写数字
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================");
    }
}
