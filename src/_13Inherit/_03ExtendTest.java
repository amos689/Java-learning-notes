package _13Inherit;

/*
    继承
        1.继承是面向对象三大特征之一, 三大特征分别是: 封装 继承 多态
        2.继承的最基本作用是代码复用, 但是更重要的是有了继承才有方法的覆盖和多态
        3.继承的语法格式:
            [修饰符列表] class 类名extends 父类名{
                类体 = 属性 + 方法
            }
        4.Java语言中的继承只支持单继承, 一个类不能同时继承很多类, 只能继承一个类
          在C++中支持多继承
        5.关于继承中的一些术语:
            B类继承A类, 其中:
                A类称为父类/基类/超类/superclass
                B类称为子类/派生类/subclass
        6.在Java语言中, 子类继承父类都继承哪些数据呢
            * 私有的不支持继承
            * 构造方法不支持继承
            * 其他数据都可以被继承
        7.虽然Java语言中只支持单继承, 但是一个类也可以间接继承其他类, 例如:
            C extends B{
            }
            B extends A{
            }
            A extends T{
            }
            C直接继承B类, 间接继承A类和T类
        8.Java语言中, 假设一个类没有显示继承任何类, 该类默认继承JavaSE库中提供的
          Java.lang.Object类. Java语言中任何一个类中都有Object类的特征
        9.IDEA查找类型[Open Type]快捷键: 双击shift. Eclipse中: ctrl + shift + t
        10.Eclipse查找资源[Open Resource]: ctrl + shift + r
 */
public class _03ExtendTest {
    public static void main(String[] args) {
        /*
        _03ExtendTest et = new _03ExtendTest();
        String s = et.toString(); //toString方法是Object类中的特征
        System.out.println(s);
        //返回_13inherit._03ExtendTest@77459877
        */
        _02CreditAccount act = new _02CreditAccount();
        act.setActnum("act-001");
        act.setBalance(-1000.0);
        act.setCredit(0.99);
        System.out.println(act.getActnum() + ", " + act.getBalance() + ", " + act.getCredit());
    }
}
