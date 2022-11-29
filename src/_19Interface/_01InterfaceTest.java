package _19Interface;

/*
    接口:
    1.接口也是一种引用数据类型, 编译之后也是一种.class文件
    2.接口是完全抽象的, 抽象类是半抽象的(接口是特殊的抽象类)
    3.接口如何定义: [修饰符列表] interface 接口名 {}
    4.接口可以继承, 也可以多继承, 一个接口可以继承多个接口
    5.接口中只包含两部分内容, 一部分是常量, 另一部分是抽象方法
    6.接口中所有的元素都是public修饰的(都是公开的)
    7.接口中的抽象方法定义时, public abstract修饰符可以省略不写, 抽象方法不能有方法体{}
    8.接口中的常量定义时, public static final修饰符可以省略不写
    9.接口中的方法都是抽象方法, 所以接口中的方法不能有方法体
    10.一个非抽象类, 实现接口时, 必须将接口中所有的抽象方法全部实现(覆盖/重写)
    11.一个类可以实现多个接口
    12.extends和implements可以共存, extends在前, implements在后
    13.使用接口, 在写代码的时候可以使用多态(父类型引用指向子类型对象)
    14.抽象类也可以实现接口, 不用将接口中所有抽象方法全部实现
 */
/*
    抽象类是半抽象的, 接口是完全抽象的
    抽象类中有构造方法, 接口中没有抽象方法
    接口和接口之间支持多继承, 类和类之间只能单继承
    一个类可以同时实现多个接口, 一个接口只能继承一个类
    接口使用的比抽象类多, 接口一般都是对"行为"的抽象
 */
public class _01InterfaceTest {
    public static void main(String[] args) {
        //访问接口中的常量
        System.out.println(MyMath.PI);
    }
}

//定义一个接口, 也会生成.class的字节码文件
interface A {

}

//定义接口
interface B extends A { //interface支持继承

}

//继承接口
interface C extends A, B { //interface支持多继承

}

//我的数学接口
interface MyMath{
    //常量
    public static final double PI = 3.1415926;
    //既然都是常量, 那么写代码的时候, public static final可以省略
    //接口中随便写一个变量就是常量, 值不能发生改变
    double i = 3.14;
    //抽象方法
    public abstract int sum(int a, int b);
    //接口中既然都是抽象方法, 那在写代码的时候, public abstract可以省略
    int mul(int a, int b);
}