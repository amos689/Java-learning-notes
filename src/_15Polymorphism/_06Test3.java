package _15Polymorphism;

/*
    多态在实际开发中的作用, 以下以主人喂养宠物作为案例说明多态的作用:
        1.分析: 主人喂养宠物这个场景要实现需要进行类型的抽象:
            - 主人[类]: 喂养
            - 宠物[类]: 吃
        2.面向对象的核心: 定义好类, 然后将类实例化为对象, 给一个环境驱使一下, 让各个对象协作起来形成一个系统
        3.多态的作用:
            降低程序的耦合度, 提高程序的扩展力
            能使用多态, 尽量使用多态
            父类型引用指向子类型对象

        核心: 尽量面向抽象编程, 尽量不要面向具体编程
 */
public class _06Test3 {
    public static void main(String[] args) {
        //创建主人对象
        _08Master zhangsan = new _08Master();

        //喂养
        zhangsan.feed(new _07Cat());
        zhangsan.feed(new _09Dog());
    }
}
