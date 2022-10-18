package _20PackageAndImport;
//将需要的类引入
import _11This._09SumUp;

public class _02Test {
    public static void main(String[] atgs) {
        //创建HelloWorld对象
        _20PackageAndImport._01HelloWorld hw1 = new _20PackageAndImport._01HelloWorld();
        System.out.println(hw1); //输出地址

        //如果在同一个包内, 则包名可以省略, 如果不在一个package则包名一定不能省略
        _01HelloWorld hw2 = new _01HelloWorld();
        System.out.println(hw2);
        //在没有import的情况下, 不能省略_11This.
        _11This._09SumUp su1 = new _11This._09SumUp();
        //import _11This._09SumUp之后, 就可以省略_11This.
        _09SumUp su2 = new _09SumUp();
        System.out.println(su1);
        System.out.println(su2);
    }
}
