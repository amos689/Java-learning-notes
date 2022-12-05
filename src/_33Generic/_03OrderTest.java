package _33Generic;

import org.junit.Test;

/*
    关于自定义泛型类/泛型接口: _02Order
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
}
