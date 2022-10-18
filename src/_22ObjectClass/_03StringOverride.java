package _22ObjectClass;

/*
    java语言当中的字符串String有没有toString方法, 有没有重写equals方法
    String类也重写了toString方法

    大结论:
        Java中什么类型的数据可以使用"=="判断
            基本数据类型比较是否相等使用"=="
        Java中什么类型的数据需要使用equals判断
            Java中所有的引用数据类型统一使用equals判断是否相等
 */
public class _03StringOverride {
    public static void main(String[] args) {
        //大部分情况下, 采用这样的方式创建字符串对象
        String s1 = "hello";
        String s2 = "word";

        //其实上, String也是一个类, 不属于基本数据类型
        //既然String是一个类, 那么也存在构造方法
        String s3 = new String("test1");
        String s4 = new String("test1");
        System.out.println(s3 == s4); //"=="比较地址, 结果肯定false
        //必须调用equals方法, String类重写了equals方法
        System.out.println(s3.equals(s4)); //true, 说明equals被重写了

        //String类有没有重写toString方法呢, 如果没有重写会输出java.lang.String@地址
        String x = new String("中国");
        System.out.println(x.toString()); //输出"中国", 说明重写了
    }
}