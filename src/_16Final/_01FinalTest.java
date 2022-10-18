package _16Final;

/*
    关于Java中的final关键字:
        1.final是一个关键字, 表示最终的, 不可变的
        2.final修饰的类无法被继承
        3.final修饰的方法无法被覆盖
        4.final修饰的变量一旦赋值之后, 不可重新赋值
        5.final修饰的实例变量, 必须手动赋值, 不能采用系统默认值
        6.final修饰的引用, 一旦指向某个对象之后, 不能再指向其他对象, 被指向的对象
          也无法被垃圾回收器回收, 但是被指向的对象内部的变量是可以被修改的
        7.final修饰的实例变量, 一般和static联合使用, 被称为常量
 */
public class _01FinalTest {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);

        final int k;
        k = 100; //可以一次赋值
        System.out.println(k);
        //k=200; * Cannot assign a value to final variable 'k'
    }
}

/*
class MyString extends String{
  //Cannot inherit from final 'java.lang.String'
  //String在源文件是public final class String, 无法被继承
}
*/
