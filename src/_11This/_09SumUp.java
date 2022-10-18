package _11This;

public class _09SumUp {
    //带有static的方法
    public static void method1() {
        //调用doSome方法
        //完整方式调用
        //省略方式调用
        System.out.println("-----这是在method1方法-----");
        _09SumUp.doSome();
        doSome();

        //调用doOther方法
        //完整方式调用
        //省略方式调用: 无
        _09SumUp su1 = new _09SumUp();
        su1.doOther();

        //访问i
        //完整方式访问
        //省略方式访问: 无
        System.out.println(su1.i);
    }

    //没有static的方法
    public void method2() {
        //调用doSome方法
        //完整方式调用
        //省略方式调用
        System.out.println("-----这是在method2方法-----");
        _09SumUp.doSome();
        doSome();

        //调用doOther方法
        //完整方式调用
        //省略方式调用
        this.doOther();
        doOther();

        //访问i
        //完整方式访问
        //省略方式访问
        System.out.println(i);
        System.out.println(this.i);
    }

    //主方法
    public static void main(String[] args) {
        //调用method1方法
        //完整方式调用
        //省略方式调用
        System.out.println("-----这是在main方法-----");
        _09SumUp.method1();
        method1();

        //调用method2方法
        //完整方式调用
        //省略方式调用: 无
        _09SumUp su = new _09SumUp();
        su.method2();
    }

    //没有static的变量
    int i = 10;

    //带有static的方法
    public static void doSome() {
        System.out.println("Do some!");
    }

    //没有static的方法
    public void doOther() {
        System.out.println("Do other!");
    }
}
