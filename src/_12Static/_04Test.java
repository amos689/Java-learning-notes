package _12Static;

/*
    实例语句块/代码块
    1.实例代码块也可以编写多个
    2.实例代码块在构造方法执行之前执行, 构造方法执行一次, 实例代码块对应执行一次
    3.实例代码块也是Java语言为程序员准备的特殊的时机, 叫对象初始化时机

 */
public class _04Test {
    public _04Test() {
        System.out.println("_04Test类的缺省构造器执行"); //发现先输出123后输出构造器执行
    }
    {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }

    public static void main(String[] args) {
        System.out.println("Main begin!"); //前面没有执行
        new _04Test();
        new _04Test();
    }
}
