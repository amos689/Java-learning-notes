package _21ControlPermissions;

/*
    访问控制权限都有哪些: private(私有); protected(受保护的); public(公开的); (默认)
    以上四个访问控制权限控制范围是什么:
        * private是私有的, 只能在本类中访问
        * public表示公开的, 在任何位置都能访问
        * 默认表示只能在本类/同包下访问
        * protected表示只能在本类/同包/子类中访问
    控制符         本类             同包              子类          任意位置
------------------------------------------------------------------------
    public        可以             可以              可以          可以
    protected     可以             可以              可以          不行
    默认           可以             可以              不行          不行
    private       可以             不行              不行          不行
    范围从上到下一次减少
    * 访问控制符可以修饰什么: 属性(四个均可)/方法(四个都可, 无论是否静态)/类(public和默认)/接口(public和默认)

 */
public class _01Test {
    public static void main(String[] args) {
        _02User user = new _02User();
        //System.out.println(user.id); 报错, private修饰的变量只能在本类中使用
        System.out.println(user.age);//protected在其他包中即使导包, 也不能访问
        System.out.println(user.weight);
        System.out.println(user.name);//"默认"在其他包中导包之后也不能访问
        /*
            protected和默认的在不同包下进行导包后的不同点在于如果这个新创建的类继承了导入包
            中的类, 则默认的变量依然无法访问
        */
    }
}
