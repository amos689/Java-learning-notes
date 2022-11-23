package _15Polymorphism;

/*
    关于java语言中的多态的机制[语法]
        1. Animal, Cat, Bird三个类之间的关系
            Cat继承Animal
            Bird继承Animal
            Cat和Bird没有继承关系
        2. 面向对象三大特征: 封装, 继承, 多态
        3. 关于多态中涉及到的几个概念:
            * 向上转型(upcasting): 子类型向父类型转型
                又被称为自动类型转换
            * 向下转型(downcasting): 父类型向子类型转型
                又被称为强制类型转换
            * 无论是向上还是向下转型, 要想通过编译, 两种类型间必须要有继承关系


 */
public class _04Test {
    public static void main(String[] args) {
        //以前编写的程序
        _01Animal a1 = new _01Animal();
        a1.move();
        _02Cat c1 = new _02Cat();
        c1.move();
        c1.catchMouse();
        _03Bird b1 = new _03Bird();
        b1.move();
        System.out.println("-----------------");
        //使用多态语法机制
        /*
            1.Animal和Cat之间存在继承关系, Animal是父类, Cat是子类
            2.Cat is an Animal
            3.new _02Cat()创建的对象的类型是Cat, a2这个引用的数据类型是Animal,
              可见他们进行了类型转换, 子类型转换为了父类型, 成为了向上转型
         */
        _01Animal a2 = new _02Cat(); //等号右边先执行, 翻译为猫是动物, 子转父
        //_03Bird b2 = new _02Cat();编译报错, 因为二者没有继承关系, 无法向上或者向下转型
        //编译器看的时候只能看a2是Animal类, 由于在Animal中有move, 所以编译通过, 称为静态绑定
        //只有静态绑定成功后, 编译才能通过, 之后才能有后续的运行
        //在运行阶段, JVM堆内存中创建的真实对象是Cat对象, 那么以下程序在运行阶段
        //一定会用Cat对象的move方法, 此时发生了程序的动态绑定
        //无论Cat类中有没有重写move方法, 运行阶段一定调用Cat对象的move方法, 因为底层真实对象就是Cat对象
        //父类型引用指向子类型对象这种机制导致程序存在编译阶段的绑定和运行阶段的绑定, 这种机制可以称为一种多态语法机制
        a2.move();//猫在走猫步

        //不能调用a2.catchMouse, 因为是子类型特有的方法
        /*
            因为在编译阶段编译器检查到a2的类型是Animal类型, 从Animal.class字节码文件中
            找不到catchMouse, 导致静态绑定失败, 也就是编译失败
            想要调用, 就必须进行类型转换为Cat类型
            a2类型为Animal(父类), 转换成Cat类型(子类), 被称为向下转型/强制类型转换
            向下转型也需要两种类型之间存在继承关系, 不然编译报错
            强制类型转换需要强制类型转换符
            什么时候需要向下转型呢
                当调用的方法是子类型中特有的, 在父类型中不存在时
         */
        //方法1
        _02Cat c2 = (_02Cat)a2;
        c2.catchMouse();
        //方法2
        ((_02Cat) a2).catchMouse();

        /*
            _01Animal a3 = new _03Bird();
            _02Cat c3 = (_02Cat)a3;
            1.一下程序编译是没问题的因为编译器检查到a3的数据类型是Animal
              Animal和Cat之间存在继承关系, 并且Animal是父类型, Cat是子类型
              父类型转换为子类型叫向下转型, 语法上合格, 编译通过
            2.程序虽然编译通过, 但是在运行阶段会出现异常, 因为堆内存
              当中真实的对象是Bird类型, Bird对象无法转换成Cat, 因为二者没有继承关系
            3.出现著名异常: java.lang.ClassCastException: 类型转换异常
              这种异常总在向下转型过程中发生
            4.向上转型只要编译通过, 运行肯定不会出问题
              向下转型可能编译通过, 运行时出问题
            5.避免出现ClassCastException
                使用instanceof运算符可以避免异常(什么是什么的实例吗)
            6.instanceof怎么用
                * 引用名 instanceof 数据类型名
                * 以上运算符的执行结果是布尔类型, 结果为true/false
                * 关于运算结果:
                    假设 (a instanceof _01Animal)
                    true: 表示a引用指向的对象是一个Animal类型
                    false: 表示a引用指向的对象不是一个Animal类型
            7.Java规范(建议)中要求, 在强制类型转换之前, 建议采用instanceof运算符进行判断
              避免出现java.lang.ClassCastException
         */
        //正确操作如下:
        _01Animal a3 = new _03Bird();
        if(a3 instanceof _02Cat) {
            _02Cat c3 = (_02Cat)a3;
        }else {
            System.out.println("类型转换异常"); //输出类型转换异常
        }
    }
}
