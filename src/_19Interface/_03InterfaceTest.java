package _19Interface;

/*
    接口之间支持多继承, 那么一个类可以同时实现多个接口吗?
        对于计算机来说, 一个机箱上有多个接口, 一个接口是接显示器的, 一个接口上是接电源的...
    *** 一个类可以同时实现多个接口
    这种机制弥补了Java中的哪个缺陷
        Java中类和类只支持单继承, 实际上单继承是为了简单而出现的, 现实世界中存在多继承
        Java中的接口弥补了单继承带来的缺陷

    之前有一个结论:
        无论向上转型还是向下转型, 两种类型之间必须要有继承关系
        没有继承关系编译器会报错(这句话不使用于接口方面)
        最终实际上和之前还是一样的, 毕竟能过编译不一定运行不报错
        还是需要加instanceof关系符进行判断
        向下转型养成好习惯, if (A instanceof B) {...}
 */
public class _03InterfaceTest {
    public static void main(String[] args) {
        //多态怎么用
        D d = new G();
        E e = new G();
        F f = new G();
        //e.m1(); 错误,
        E e2 = (E)d; //甚至可以强制转换为任何没有联系的接口, 但是运行时可能出现ClassCastException异常
        e.m2(); //能正常执行, 因为d就是指向G, 再转到E不会出现异常
    }
}

interface D {
    void m1();
}

interface E {
    void m2();
}

interface F {
    void m3();
}

//实现多个接口, 其实类似于多继承
class G implements D,E,F {
    //一个类可以同时实现多个接口
    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    public void m3() {
        System.out.println("m3");
    }
}