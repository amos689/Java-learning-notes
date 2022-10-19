package _31Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04ExceptionTest {
    //采用throws方式和try...catch
    //一般不建议在main方法使用throws, 因为异常如果真的发生了, 一定会抛出给JVM
    //一般main方法中的异常使用try...catch
    public static void main(String[] args) {
        System.out.println("main begin!");
        try {
            //try尝试
            m1();
        } catch(Exception e) {
            //catch是捕捉异常后走的分支
            System.out.println("文件出现了一些问题");
        }
        System.out.println("main over!");
    }

    private static void m1() throws Exception {
        System.out.println("m1 begin!");
        m2();
        System.out.println("m1 over!");
    }

    private static void m2() throws IOException {
        System.out.println("m2 begin!");
        m3();
        System.out.println("m2 over!");
    }

    private static void m3() throws FileNotFoundException {
        //调用SUN jdk的某个IO流的构造方法
        //我们只是先借助这个类学习一下异常处理机制
        /*
            编译报错的原因是什么:
                1.这里调用了一个构造方法: FileInputStream(String name)
                2.这个构造方法的声明位置上有: throws FileNotFoundException
                3.通过类的继承结构可以看到: FileNotFoundException的父类是IOException
                  IOException的父类是Exception
                  所以FileNotFoundException是编译时异常, 编写时必须进行处理
         */
        //new FileInputStream("D:\\Program Files");

        //我们采用第一种处理方式: 在方法声明的时候继续上抛
        //想要不报错, 继续把m2, m1, main都throws一遍
        //只能抛FileNotFoundException或者它的父类(父类的话以后的抛出范围只能比父类还大或维持不变, 不能还是原来的), 不能抛出别的
        new FileInputStream("D:\\Program Files");
    }
}
