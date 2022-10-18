package _17Super;

/*
    1.super是一个关键字, 全部小写
    2.super和this对比着学习
        this:
            this只能存在于实例方法和构造方法中
            this的语法是: this./this()
            this不能使用在静态方法中
            this.大部分情况下可以省略, 除了在区分实例变量和局部变量的时候
            this()只能出现在构造方法的第一行, 通过当前构造方法去调用本类中其他的构造方法, 目的是代码复用
        super:
            super只能存在于实例方法和构造方法中
            super的语法是: super./super()
            super不能使用在静态方法中
            super.大部分情况下可以省略
            super()只能出现在构造方法的第一行, 通过当前构造方法去调用父类中其他的构造方法, 目的是创建子类对象时先初始化父类特征
    3.super()
        表示通过子类的构造方法调用父类的构造方法.
        模拟现实世界中想要有儿子先要有父亲
    4.重要结论:
        当一个构造方法第一行:
            既没有this()又没有super()的话, 默认会有一个super();
            表示通过当前子类构造方法调用父类的无参数构造方法
            所以必须保证父类的无参数构造方法是存在的
    5.注意:
        this()和super()不能共存, 它们都是在构造方法的第一行
        this可以单独输出, 但是super必须加".":
            super不是引用, 不保存内存地址, 也不指向任何对象, 只是代表当前对象内部那块父类型的特征
    6.whatever, 父类的构造方法是一定会执行的(百分百)
 */
public class _01SuperTest {
    public static void main(String[] args) {
        //创建子类对象
        new B();
        /*运行结果
            A类的无参数构造方法
            B类的无参数构造方法
         */
    }
}

class A{
    public A() {
        System.out.println("A类的无参数构造方法");
    }
    public A(int a) {
        System.out.println("A类的有参数构造方法, 结果为" + a);
    }
}

class B extends A{
    public B() {
        /*
            如果要:
            this("zhangsan");
            那就不能有super(100);
            二者只能取一个, 不能共存, 都是只能出现在构造方法的第一行
         */

        //其实这里省略了super(); 因为可以省略
        /*
            但是当A中无参数构造方法变成有参数时
            public A(int a) {
                System.out.println(a);
            }
            这个super();就不能省略, 因为系统不再提供无参数构造方法
            应该改为super(a);
         */
        //super(100);
        this("zhangsan");
        System.out.println("B类的无参数构造方法");
        /*
            A类的无参数构造方法
            B的有参数构造方法zhangsan
            B类的无参数构造方法
         */
    }

    public B(String name) {
        System.out.println("B的有参数构造方法" + name);
    }
}