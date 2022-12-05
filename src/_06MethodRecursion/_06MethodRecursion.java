package _06MethodRecursion;

/*
    关于方法的递归调用
        1.什么是递归：方法自身调用自身
        2.递归非常消耗栈内存，能不用就不用
        3.栈溢出错误：java.lang.StackOverflowError
          错误无法挽回，结果就是JVM停止工作
        4.递归必须有结束条件，否则一定会发生溢出错误
 */
public class _06MethodRecursion {
    // 递归计算1~N
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入最终的数:");
        int resInt = s.nextInt();
        int retValue = recSum(resInt);
        System.out.println(retValue);
    }

    public static int recSum(int a) {
        return a==1 ? 1 : a+recSum(a-1);
    }
}
