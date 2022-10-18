package _26WrapperClass;

public class _05IntegerTest {
    public static void main(String[] args) {
        /*
            分析以下程序是为什么
            这是Integer十分重要的面试题
         */
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); //false

        //java中为了提高执行效率, 将一个byte的取值范围内的整数(-128 ~ +127)已经提前包装好放到了方法区的整数型常量池中
        //目的是只要这个取件单数据就不需要再new对象了, 直接从整数型常量池中取出来
        //原理是x中保存的内存地址和y中保存对象的内存地址是一样的
        Integer x = 127; //Integer类加载时就已经进行创建整数型常量池
        Integer y = 127;
        //"=="永远判断的都是两个对象的内存地址是否相同
        System.out.println(x == y); //true
    }
}
