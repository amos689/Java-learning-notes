package _25String;

/*
    实际开发中, 如果需要进行字符串的频繁的拼接, 会遇到什么问题
        - 因为java中的字符串时不可变的, 每次拼接都会产生新的字符串, 这样会占用大量的方法区内存, 造成内存空间的浪费
            String s = "abc";
            s += "hello"
            简单的两行代码表, 创建三个对象: "abc", "hello", "abchello"

    如果以后需要进行大量的字符串的拼接操作, 建议使用JDK中自带的:
    java.lang.StringBuffer / java.lang.StringBuilder

    如何优化StringBuffer的性能
        - 在创建StringBuffer的时候, 尽可能给定一个初始化的容量, 减少底层数组的扩容次数

 */
public class _08StringBuffer {
    public static void main(String[] args) {
        //创建一个初始化容量为16的byte数组(字符串缓冲区对象)
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串, 统一调用append方法, 可以追加String / boolean / char / char[]...
        stringBuffer.append("ab");
        stringBuffer.append('c');
        stringBuffer.append(new char[] {'d', 'e', 'f'});
        stringBuffer.append(true);
        stringBuffer.append(3.14);
        stringBuffer.append(100L);
        //append方法底层在进行追加的时候, 如果byte数组满了, 会自动扩容
        /*
            String类中的byte[] value和StringBuffer类中的byte[] value区别是:
            String中是private final byte[] value
            StringBuffer中是byte[] value
            少一个final, 使得StringBuffer中的字符串可以被修改
            StringBuffer的底层中对象保存的内存地址是可以更改的, 老对象在使用之后会被垃圾回收器进行回收

        */
        System.out.println(stringBuffer);
    }
}
