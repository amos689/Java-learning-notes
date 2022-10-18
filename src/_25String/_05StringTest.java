package _25String;
/*
    分析以下程序创建了几个对象
 */
public class _05StringTest {
    public static void main(String[] args) {
        /*
            一共三个对象:
                方法区字符串常量池中: "hello", 一个
                堆内存中: s1, s2, 两个
         */
        String s1 = new String("hello");
        String s2 = new String("hello");
    }
}
