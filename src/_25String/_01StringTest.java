package _25String;

/*
    关于java JDK当中内置的一个类: java.lang.String
        1.String表示字符串类型, 属于引用数据类型, 不属于基本数据类型
        2.在java中随便使用双引号括起来的都是String对象, 如: "JDK" "def" "你好"
        3.java中规定: 双引号括起来的字符串是不可变的, 也就是说"abc"从出生到死亡都不可变, 不能变成"ab"等
        4.双引号括起来的字符串, 都是直接存储在方法区的字符串常量池中
        为什么SUN把字符串设置存储在一个字符串常量池中?
            因为在实际开发中, 字符串使用太过频繁, 为了执行效率, 所以把字符串放到
            了方法区的字符串常量池中
 */
public class _01StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1 + "def"; //即便是改成"abc" + "def", 也不会新建变量, 而是调用s1
        //截止目前, 上面共计创建了三个字符串变量, "abc", "def", "abcdef"

        //这是通过new方法创建的字符串对象
        //凡是双引号括起来的, 都在字符串常量池中有一份
        //但是new对象的时候, 一定是在堆内存中开辟空间
        String s3 = new String("abc"); //这里的s3指向堆内存中String对象的地址, 这个对象存放方法区中原来的"abc"的地址


        //i中保存的是100这个值
        int i = 100;
        //s1变量中保存的是字符串对象的内存地址: 不是"abc", 而是0x1111
    }
}
