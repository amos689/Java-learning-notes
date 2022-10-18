package _11This;

/*
    最终结论:
        在带有static的方法中不能"直接"访问实例变量和实例方法
        因为实例变量和实例方法都需要对象的存在
        而static的方法中是没有this的, 也就是说当前对象是不存在的
        自然而然也是无法访问当前对象的实例变量和实例方法
 */
public class _04ThisTest {
    //带有static
    //主方法
    public static void main(String[] args) {
        //调用doSome方法
        _04ThisTest.doSome();
        //调用doSome方法
        doSome();

        //调用doOther对象
        //[编译错误] _04ThisTest.doOther(); 实例方法必须先创建对象
        _04ThisTest tt = new _04ThisTest();
        tt.doOther(); //实例方法引用.
        tt.run();
    }
    //带有static
    public static void doSome() {
        System.out.println("Do some!");
    }

    //不带static, 实例方法
    public void doOther() {
        //this表示当前对象
        System.out.println("Do other!");
    }

    //实例方法
    public void run() {
        //run是实例方法, 调用run方法的一定有对象存在
        //也就是说, 这里一定是有this的
        System.out.println("Run execute!");
        //doOther是一个实例方法, 实例方法调用必须有对象存在
        //调用的意义就是调用当前对象的doOther方法
        doOther(); //this.大部分情况下是可以省略的
    }
}
