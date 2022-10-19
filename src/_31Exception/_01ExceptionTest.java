package _31Exception;

/*
    1.什么是异常, Java提供异常机制有什么用
        以下过程中发生了不正常的情况, 而这种不正常的情况叫做异常
        Java会把异常信息打印输出到控制台, 程序员看到异常信息之后, 可以依据此信息修改程序
    2.以下程序执行, 控制台出现了异常信息, 这个信息是JVM打印的
 */
public class _01ExceptionTest {
    public static void main(String[] args) {
        /*
        我观察到异常信息, 就会修改, 让程序更加健壮
        int a = 10;
        int b = 0;
        int c = a / b; //实际上JVM在执行到此处时会new一个异常对象, 然后将异常抛出, 打印到控制台
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(a + " / " + b + " = " + c);
        */

    }
}