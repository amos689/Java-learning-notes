package _23AnonymousInnerClass;

public class _02Test {
    public static void main(String[] args) {
        //调用MyMath中的sum方法
        MyMath mm = new MyMath();

        //合并(这样写代码, 表示这个类名是有的, 类名是: ComputeImp)
        //mm.sum(new ComputeImp(), 100, 200);使用匿名内部类之前调用

        //使用匿名内部类, 表示这个ComputeImp类没有名字了, 匿名内部类是一个局部内部类
        //这里表面上看上去好像是接口可以直接new了, 实际上并不是
        //后面的"{}"代表了对接口的实现
        //不建议使用匿名内部类, 因为一个类没有名字, 没有办法重复使用, 而且太乱,可读性差
        //学的目的是看懂别人的代码(苦笑)
        //补充: IDEA的纠错工具是: alt + 回车
        mm.sum(new Compute() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 200);
    }
}

//负责计算的接口, 需要被实现
interface Compute {
    //抽象方法
    int sum(int a, int b);

}

/*
//Computer接口的实现类
class ComputeImp implements Compute {
    public int sum(int a, int b) {
        return a + b;
    }
}
这一切在你使用匿名内部类之后都可以不写
*/

//数学类
class MyMath {
    //数学求和方法
    public void sum(Compute c, int x, int y) {
        int retValue = c.sum(x, y);
        System.out.println(x + " + " + y + " = " + retValue);
    }
}