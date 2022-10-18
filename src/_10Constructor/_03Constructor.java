package _10Constructor;
/*
    构造方法的作用:
        1.创建对象
        2.给实例变量赋值
 */
public class _03Constructor {
    public static void main(String[] args) {
        //ps: 查看访问的哪个方法, 按住ctrl, 移动鼠标到查看的元素上, 出现下划线后单击
        //创建对象
        _04Account act1 = new _04Account();
        //查看对象的值
        //必须先有对象. 才能有相应实例变量
        System.out.println("账号: " + act1.getActnum());
        System.out.println("余额: " + act1.getBalance());

        _04Account act2 = new _04Account("小明");
        System.out.println("账号: " + act2.getActnum());
        System.out.println("余额: " + act2.getBalance());

        _04Account act3 = new _04Account(10000.0);
        System.out.println("账号: " + act3.getActnum());
        System.out.println("余额: " + act3.getBalance());

        _04Account act4 = new _04Account(10000.0, "小红");
        System.out.println("账号: " + act4.getActnum());
        System.out.println("余额: " + act4.getBalance());
        //经过add方法, main方法和add方法中的Balance都变了, 证明传递的是指针变量
        //传递给add方法时候, 传递的是act4的值, 只不过这个值是一个地址
        add(act4);
        System.out.println("小红现余额: " + act4.getBalance());
    }

    public static void add(_04Account a) {
        a.setBalance(a.getBalance() + 10.0);
        System.out.println("小红现余额: " + a.getBalance());
    }
}
