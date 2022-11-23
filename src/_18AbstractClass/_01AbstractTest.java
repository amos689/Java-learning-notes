package _18AbstractClass;

/*
    类到对象是实例化, 对象到类是抽象
    抽象类:
        1.什么是抽象类
            类和类之间具有共同特征, 将这些特征提取出来, 形成的就是抽象类
            由于类的级别本身就是不存在的, 所以更高一级的抽象类就无法直接创建对象
        2.抽象类属于什么类型
            抽象类也属于引用数据类型
        3.抽象类怎么定义
            语法:
                [修饰符列表] abstract class 类名 {
                    类体;
                }  //抽象类无法实例化
        4.抽象类是无法实例化的, 无法创建对象的, 所以抽象类是用来被子类继承的
        5.final和abstract不能联合使用
        6.抽象类的子类依然可以是抽象类
        7.抽象类虽然无法实例化, 但是依然是有构造方法的, 因为能够被super(), 是专门供子类使用的
        8.抽象类关联到一个概念: 抽象方法
            抽象方法表示一个没有实现的方法, 没有方法实体的方法, 例如
            public abstract void doSome();没有大括号, 且加abstract
            抽象方法特点是: 没有方法体, 以分号结尾
                         前面修饰符列表有abstract关键字
        9.抽象类中不一定有抽象方法, 但是抽象方法必须在抽象类中
        10.判断: Java中凡是没有方法体的方法都是抽象方法
        错, Object类中很多方法也没有方法体, 都是以;结尾的, 但是他们都不是抽象方法
        例如public native int hashCode(); 这个方法底层调用C++动态链接库

 */
public class _01AbstractTest {
    public static void main(String[] args) {

    }
}

//银行账户类(无法被实例化)
abstract class Account{ //AbstractClass存在的目的就是被继承, 所以前面加final是一件非法的修饰符组合
    /*
        public Account(String s) {
        }
        是会报错的, 原因是有了有参数的构造方法之后, 系统不会默认增加无参数的构造方法
        也证明了抽象类也是有构造方法的, 只是不能被实例化
     */
    //可以有抽象方法public abstract void withdraw();
    //也可以有非抽象方法public void doSome(){}
}

//子类继承抽象类, 子类可以实例化对象
class CreditAccount extends Account{ //其实class前还能加abstract, 即抽象类也能继承抽象类

}