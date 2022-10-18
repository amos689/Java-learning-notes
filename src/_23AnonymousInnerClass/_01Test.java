package _23AnonymousInnerClass;

/*
    匿名内部类:
        1.什么是内部类
            在类的内部又定义了一个新的类, 被称为内部类
        2.内部类的分类
            静态内部类: 类似于静态变量
            实例内部类: 类似于实例变量
            局部内部类: 类似于局部变量
        3.使用内部类编写的代码, 可读性很差, 能不用尽量不用
        4.类能用的修饰符, 内部类也能用
        5.匿名内部类是局部内部类的一种, 因为这个类没有名字, 所以叫匿名内部类
 */
public class _01Test {
    //类在类的内部, 称为内部类
    //前面加static叫做静态内部类
    static class Inner1 {

    }

    //没有static叫做静态内部类
    class Inner2 {

    }

    //方法
    public void doSome() {
        //局部变量
        int i = 100;
        //局部内部类
        class Inner3 {

        }
    }
}
