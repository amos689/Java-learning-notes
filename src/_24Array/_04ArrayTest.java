package _24Array;

/*
    1.main方法上面的"String[] args"有什么用
        JVM调用main方法会自动传递一个数组
 */
public class _04ArrayTest {
    //这个方法程序员负责写出来, JVM负责调用. JVM调用的时候, 一定会传一个String[]来
    public static void main(String[] args) {

        //JVM传递过来的这个数组对象的长度: 默认0
        //测试得出: args不是null, 不然会空指针异常
        System.out.println("JVM传递过来的String数组参数, 这个数组长度是: " + args.length);
        //相当于数组对象创建了, 但是数组中没有数据:
        //String[] strs = new String[0];
        //或者String strs = {};
        /*
            这个数组什么时候里面会有值呢
            其实这个数组是留给用户的, 用户可以在控制台上输入参数, 这个参数自动会被转换为"String[] args"
            例如在控制台这样运行: java _04ArrayTest abc def xyz
            那么这个时候JVM就会自动将abc def xyz通过空格的方式进行分离, 完成分离后自动放到String[]数组中
            所以String[] args主要接收用户输入
         */
    }
}
