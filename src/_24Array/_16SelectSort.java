package _24Array;

/*
    选择排序:
        循环一次, 找出这些数据中最小的值, 拿着这个最小值和参与比较的这堆最前面的元素交换位置
        选择排序的好处是: 每次的位置交换都是有意义的
 */
public class _16SelectSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 6, 8};
        for(int i = 0; i < arr.length; i++) { //每一次都将最大的移动至最左边
            int max = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[max] < arr[j]) {
                    max = j;
                }
                if(max != i) {
                    int buf = arr[i];
                    arr[i] = arr[max];
                    arr[max] = buf;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
