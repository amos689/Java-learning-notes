package _31Exception;

/*
    final, finally, finalize有什么区别
    final, finally是关键字
    finalize是标识符
 */
public class _11ExceptionProblem {
    public static void main(String[] args) {
        //final是一个关键字, 表示最终的, 不变的: 变量不能更改, 类不能继承, 方法无法覆盖
        final int i = 100;

        //finally也是个关键字, 和try连用, 使用在异常处理机制中
        //在finally语句块中的代码是一定会执行的
        try {

        } finally {
            System.out.println("finally...");
        }

        //finalize()是Object类中的一个方法, 作为方法名出现
        //finalize是标识符
        //finalize()在jdk9已过时
        //finalize是垃圾回收器(gc)负责调用的
    }
}
