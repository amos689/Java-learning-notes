package _24Array;

/*
    什么时候采用静态初始化, 什么时候采用动态初始化
        当创建数组时, 确定数组中存储哪些具体的元素时, 采用静态初始化方式
        当创建数组时, 不确定数组中存储哪些数据, 你可以采用动态初始化方式, 先预先分配空间
 */
public class _02ArrayTest {
    public static void main(String[] args) {
        //声明/定义一个数组, 采用动态初始化的方式创建
        int[] a = new int[4]; //创建长度为4的int数组, 数组中每个元素的默认值是0
        //遍历数组
        for(int i = 0; i < a.length; i++) {
            System.out.println("初始化的数组中的数据是: " + a[i]);
        }

        //初始化一个Object类型的数组, 采用动态初始化的方式
        Object[] objs = new Object[3]; //三个动态初始化的长度, 每个元素默认值是null
        for(int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }
}
