package _17Super;

/*
    输出内容:
    C的无参数构造方法
    D的无参数构造方法zhangsan
    E的有参数构造方法zhangsan20
    E的有参数构造方法zhangsan
    E的无参数构造方法

    在Java语言下, 不管new的是什么对象, 最后老祖宗Object类的无参数构造方法一定会执行
    (Object类的无参数构造方法是处于栈顶部, 最后调用, 最先执行结束)
 */
//最终只创建了一个对象, 只是在这个对象创建的时候继承了它的父类的特征
public class _02SuperTest {
    public static void main(String[] args) {
        new E();
    }
}

class C{
    public C() {
        System.out.println("C的无参数构造方法");//1
    }
}

class D extends C{
    public D() {
        System.out.println("D的无参数构造方法");
    }
    public D(String name) {
        System.out.println("D的有参数构造方法" + name);//2
    }
}

class E extends D{
    public E() {
        this("zhangsan");
        System.out.println("E的无参数构造方法");//5
    }
    public E(String name) {
        this(name, 20);
        System.out.println("E的有参数构造方法" + name);//4
    }
    public E(String name, int a) {
        super(name);
        System.out.println("E的有参数构造方法" + name + a);//3
    }
}