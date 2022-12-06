package _33Generic;

import org.junit.Test;
import java.util.*;

/*
    关于自定义泛型类/泛型接口: _02Order
 */

/*
    - 泛型类可能有多个接口, 此时应将对应的多个参数在一起放在尖括号内, 比如<E1, E2, E3>
    - 泛型类构造器方法如下: public GenericClass() {} //切记不要在构造器加尖括号
    - 实例化后, 原来泛型位置的结构必须和指定的泛型类型保持一致
    - 泛型不同的引用不能相互赋值(test4), 过不了编译
    - 泛型如果不指定, 将被擦除, 泛型对应的类型将一律按照Object类型处理, 但是不等价于Object(继承方面有区别)
      经验: 泛型要用就一路都用, 要不用就都不要用
    - 如果泛型结构是一个接口或者抽象类, 则不能创建泛型对象
    - 在类/接口上声明的泛型, 在本类或本接口中代表某种类型, 可以作为非静态属性的类型
      非静态方法的参数类型, 非静态方法的返回值类型. 但是在静态方法中不能使用类的泛型
    - 异常类是不能声明为泛型的(异常就不支持泛型操作)
    - 不能使用new E[], 但是可以使用E[] elements = (E[]) new Object[capacity]
    - 父类有泛型, 子类可以选择保留泛型, 也可以选择指定的泛型类型(见图)
      结论: 泛型是"富二代", 子类除了指定或者保留父类的泛型, 还可以增加自己定泛型
 */
public class _03OrderTest {

    @Test
    public void test1() {
        // 如果只是定义了泛型类, 实例化时没有指明类的类型, 则认为此泛型类型是Object类型
        // 要求: 如果定义了类是带有泛型的, 建议在实例化时要指明类的泛型
        _02Order order = new _02Order();
        order.setOrderT(123);
        order.setOrderT("abc");

        // 建议实例化时指明泛型的类型
        _02Order<String> order1 = new _02Order<String>("amos", 111, "AK");
        order1.setOrderT("M4"); //只能放String类型
        System.out.println(order1);
    }

    @Test
    public void test2() {
        //若在继承是指明父类的泛型类型, 则实例化子类对象时, 不再需要指明泛型
        _04SubOrder sub1 = new _04SubOrder("amos", 1, 1122);
        System.out.println(sub1);
    }

    @Test
    public void test3() {
        _05SubOrder<String> sub2 = new _05SubOrder<>("amos", 1, "AK");
        System.out.println(sub2);
    }

    @Test
    public void test4() {
        // 泛型不同的引用之间不能互相赋值

        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;

        // list1 = list2 //不能相互赋内存地址, 因为泛型已经不同了
    }

    @Test
    public void test5() {
        // 测试泛型方法
        _02Order<String> order = new _02Order<>();
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
        // 引用调
        List<Integer> ints = order.copyFromArrayToList(arr);
        // 类名调
        List<Integer> list = _02Order.copyFromArrayToList(arr);
        System.out.println(ints);
    }
}
