package _22ObjectClass;

/*
    在Object方法中, hashCode()方法的源代码是
        public native int hashCode();
        这个方法不是抽象方法, 带有native关键字, 底层调用C++程序
    hashCode()方法返回的是哈希码:
        实际上就是一个Java对象的内存地址, 经过哈希算法, 得出的值.
        所以hashCode()方法执行的结果可以等同看做一个Java对象的内存地址
 */
public class _07HashCode {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();
        //对象内存地址经过哈希算法转化的一个数字, 可以等同看做内存地址
        System.out.println(hashCodeValue);

        MyClass mc = new MyClass();
        int hashCodeValue2 = mc.hashCode();
        System.out.println(hashCodeValue2); //输出二者结果不同
    }
}

class MyClass {

}