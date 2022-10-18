package _24Array;

/*
    冒泡牌序算法
        拿着左边和右边进行比较, 如果左边大于右边, 则交换位置, 反之亦然
        第一次循环之后, 最大的一定出现在最右边
 */
public class _15BubbleSort {
    public static void main(String[] args) {
        //int数组对象
        int[] arr = {3, 2, 7, 6, 8};
        //冒泡排序进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { //降序, 升序时改成">"
                    int buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
            }
        }
        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
