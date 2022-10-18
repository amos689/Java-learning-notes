package _25String;

public class _04StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池中, 所以不会再新建一个
        String s2 = "hello";
        //分析结果是true还是false, 因为指向内存一致, 所以是true
        System.out.println(s1 == s2);

        String x = new String("xyz");
        String y = new String("xyz");
        //分析是true还是false, 因为x, y指向的地址是其实例的地址, 所以false
        System.out.println(x == y);

        //通过这个案例, 我们知道了, 字符串中间的比较不要使用"==", 不保险
        //应该调用String类的equals方法, String类重写了equals方法
        System.out.println(x.equals(y)); //true

        String k = new String("test");
        //"test"这个字符串后面可以加".", 因为"test"是一个String对象, 只要是对象, 都可以调用对象的方法
        System.out.println("test".equals(k)); //前文提到过: 可以避免空指针异常

    }
}
