package _22ObjectClass;

/*
    1.这个方法是protected修饰的, 在Object类中这个方法对的源代码是
        protected void finalize throws Throwable() {
        }
        GC负责调用finalize()方法
    2.finalize()方法只有一个方法体, 里面没有代码, 而且这个方法是protected修饰的
    3.这个方法不需要程序员手动调动, JVM的垃圾回收器负责调用这个方法
    4.finalize()方法执行的时机:
        当一个Java对象即将被垃圾回收器回收的时候, 垃圾回收器负责调用finalize()方法
    5.finalize()方法实际上是SUN公司为Java程序员准备的一个时机, 垃圾销毁时机
      如果希望在对象销毁时机执行一段代码的话, 这段代码要写到finalize()方法当中
    6.静态代码块的作用是:
        static{
            ...
        }
        静态代码块在类加载时刻执行, 并且只执行一次, 是类加载时机
        finalize()方法同样是SUN为程序员准备的时机, 在垃圾回收的时机
    7.Java中垃圾回收器不是轻易启动的, 垃圾太少或者时机没到就不会启动(JDK9方法过时)
 */
public class _06Finalize {
    public static void main(String[] args) {
        //创建对象
        Person p = new Person();
        //把Person对象变成垃圾
        p = null;
    }
}

class Person {
    //重写finalize()方法
    //Person类型的对象在被垃圾回收器回收的时候, 垃圾回收器负责调用p.finalize()
    protected void finalize() throws Throwable {
        System.out.println("Will be eliminate...");
    }
}