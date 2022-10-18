/*
    方法在执行过程当中，在Java内存是如何分配的，内存是如何变化的
    1.方法只定义不调用是不会执行的，并且在JVM中也不会给他内存空间
      只有在调用的时候才动态调用内存给这个方法分配空间
    2.JVM上有三块主要内存空间
        * 方法区内存
        * 堆内存
        * 栈内存
    3.关于栈（stack）数据结构
        * 数据结构反映的是数据的存储形态
        * 数据结构是独立的学科，不属于任何编程语言的范畴，只不过在大多数语言中
          要使用
        * 常见数据结构：数组、队列、栈、链表、树、哈希表
        * 栈帧永远指向栈顶元素
        * 栈顶元素处于活跃状态，其他元素静止
        * 其他术语：压栈==入栈==push；出栈==弹栈==pop
        * 最先进来的，最后出来（与队列相反）
    4.方法执行的时候，内存在哪里分配
        * 方法代码片段属于.class字节码文件的一部分，在类加载的时候，将其放在了方法区
          所以在JVM中的三块主要内存空间中方法区内最先有数据，存放了代码片段
        * 代码片段虽然在方法区内存当中只有一份，但是可以被重复利用
          每一次调用的时候，需要给该方法分配独立的内存空间，在栈内存中分配，压栈
        * 在方法执行结束后，给该方法的内存空间全部释放，出栈
    5.局部变量在方法体中声明，运行阶段在栈中被分配，生命周期最短，因为只要出了大括号
      就发生了出栈
*/
public class _04Method03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int retValue = sumInt(a, b);
        System.out.println("retValue = " + retValue);
    }

    public static int sumInt(int i, int j) {
        int result = i + j;
        int num = 3;
        int retValue = divide(result, num);
        return retValue;
    }

    public static int divide(int x, int y) {
        int z = x / y;
        return z;
    }
}
