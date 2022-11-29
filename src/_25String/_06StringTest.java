package _25String;

/*
    关于String类中的构造方法
 */
public class _06StringTest {
    public static void main(String[] args) {
        //创建字符串对象的最常用的方式
        String s1 = "hello world";

        //这里只掌握常用的构造方法

        //1.public String​(byte[] bytes)
        byte[] bytes = {97, 98, 99}; //97是a, 98是b, 99是c
        String s2 = new String(bytes);
        /*
            前面说过: 输出一个引用的时候, 会自动调用toString()方法
            但是String类已经重写了toString方法
            输出字符串对象的话, 输出的不是对象的内存地址, 而是字符串本身
         */
        System.out.println("s2 = " + s2); //abc
        System.out.println("s2 = " + s2.toString()); //abc

        //2.public String​(byte[] bytes, int offset(起始位置), int length(长度))
        String s3 = new String(bytes, 1, 2);
        System.out.println("s3 = " + s3); //bc

        //3.public String​(char[] value)将char数组转成字符串
        char[] chars = {'我', '是', '中', '国', '人'};
        String s4 = new String(chars);
        System.out.println("s4 = " + s4); //我是中国人

        //4.public String​(char[] value, int offset, int count)将char数组的一部分转成字符串
        String s5 = new String(chars, 2, 3);
        System.out.println("s5 = " + s5); //中国人
    }
}
