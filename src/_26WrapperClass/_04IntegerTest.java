package _26WrapperClass;

/*
    JDK1.5之后, 支持自动拆箱和自动装箱
    自动拆装箱好处: 方便编程
 */
public class _04IntegerTest {
    public static void main(String[] args) {
        //自动装箱, int类型自动转换为Integer类型
        Integer x = 100; //x是一个引用, x里面存放的是一个内存地址, 不要迷

        //自动拆箱, Integer类型自动转化为int类型
        int y = x;
        System.out.println(y);

        Integer z = 1000;
        //分析: 这个为什么没有报错
        System.out.println(z + 1); //因为z被自动拆箱, 变成了基本数据类型

        Integer a = 1000; //相当于Integer a = new Integer(1000); a存放地址
        Integer b = 1000;
        System.out.println(a == b); //"=="不会自动拆箱, 比较内存地址, false
        //只有在进行"+ - * /"运算时才会触发自动拆箱机制
    }
}
