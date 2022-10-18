package _10Constructor;

/*
    关于Java类中的构造方法
        1.构造方法又被称为构造函数/构造器/Constructor
        2.构造方法的语法结构
            [修饰符列表] 构造方法名(形式参数列表) {
                构造方法体;
            }
        3.回顾普通方法的语法结构：
            [修饰符列表] 返回值类型 方法名(形式参数列表) {
                方法体;
            }
        4.对于构造方法来说，返回值类型不需要指定，也不能写void
          只要写上了void，这个方法就成为普通方法了
        5.对于构造方法来说，构造方法的方法名必须和类名保持一致
        6.构造方法的作用:
            构造方法存在的意义是通过构造方法的调用, 可以创建对象
        7.构造方法怎么调用:
            普通方法是这样的
                类名.方法名(实参列表)或者方法修饰符中没有static时引用.方法名(实参列表)
            构造方法是这样的
                new 构造方法名(实参列表)
        8.构造方法调用执行之后是有返回值的, return语句不需要我们写, 构造方法结束时Java程序自动返回
          并且返回值类型是构造方法所在类的类型. 由于构造方法的返回值就是类本身,
          所以返回值类型不需要编写
        9.注释和取消注释: ctrl + /
           多行注释: ctrl + shift + /
        10.* 当一个类显示的将构造方法定义出来了, 那么系统将不再默认为这个类提供缺省构造器
           建议开发中手动为当前类提供无参数的构造方法, 因为太常用了
        11.构造方法显然是可以重载的, 就像在使用一个方法一样

 */
public class _01Constructor {
    public static void main(String[] args) {
        //new _02User();输出User's Default Constructor Invoke!
        //无参数的Constructor
        _02User u1 = new _02User(); //返回值类型就是User
        //有int参数的Constructor
        int a = 1;
        _02User u2 = new _02User(a);
        //有String参数的Constructor
        String s = "小明";
        _02User u3 = new _02User(s);
        //程序创建了三个对象, 只要构造函数调用就会创建对象, 并且一定是在堆内存中开辟的

        //调用带有static的方法: 类名.方法名
        //两种方法
        _01Constructor.doSome();
        doSome();
        //调用没有static的方法: 引用.方法名
        //doOther方法在_01Constructor中, 所以需要创建一个_01Constructor对象
        //一个类中如果没有任何构造方法的话, 系统默认提供一个无参数的构造器
        _01Constructor t = new _01Constructor();
        t.doOther();
    }

    public static void doSome() {
        System.out.println("doSome");
    }

    public void doOther(){
        System.out.println("doOther");
    }
}
