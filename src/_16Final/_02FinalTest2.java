package _16Final;

public class _02FinalTest2 {
    //成员变量之实例变量
    //不能使用final int a; 因为a会有默认值, 导致a无法被更改, 所以会报错
    //但是可以写final int a = 10; 直接赋值就不报错
    //实例变量使用final修饰后必须手动赋值, 不能采用系统默认值

    //解决方案1
    final int age = 10;

    //解决方案2
    final int age2;
    public _02FinalTest2() {
        age2 = 10;
    } //二者本质一样

    public static void mian(String[] args) {
        final int a;
        a = 100;
        //a不可二次赋值
    }
}
