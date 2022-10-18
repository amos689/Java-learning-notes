package _25String;

/*
    java.lang.StringBuilder

    StringBuffer和StringBuilder的区别
        StringBuffer中的方法都有synchronized关键字修饰, 表示StringBuffer在多线程
        环境下运行是安全的
        StringBuilder没有synchronized关键字修饰, 表示StringBuilder在多线程环境下
        运行是不安全的
        StringBuffer是线程安全的, StringBuilder是非线程安全的
        详见多线程...
 */
public class _09StringBuilder {
    public static void main(String[] args) {
        //初始化容量也是16
        StringBuilder sb = new StringBuilder();
        //StringBuilder和StringBuffer的用法几乎一样
        sb.append("abc");
        System.out.println(sb);
    }
}
