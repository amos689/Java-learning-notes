package _22ObjectClass;

/*
    * 任何一个类默认继承Object方法, 就算没有直接继承, 最终也会间接继承
    * 如何查阅Object类中的常用方法呢: 1.去看源代码; 2.去查阅Java类库中的帮助文档
    * 什么是API(Application Program Interface)
        * 是应用程序编程接口的简写
        * 整个JDK的类库就算JavaSE的API
        * 每一个API都会配置一套API帮助文档

    目前为止, 我们需要知道以下几个方法
    protected Object clone() //负责克隆对象
    int hashCode() //获取哈希值
    boolean equals(Object obj) //判断两个对象是否相等
    String toString() //将对象转换成字符串形式
    protected void finalize() //垃圾回收器负责调用的方法

    1.toString()方法
        以后所有类的toString()方法是需要重写的
        重写规则: 简明详实
        System.out.println(引用);这里会自动调用"引用"的toString方法
        String类是SUN写的, toString方法已经被重写了
    2.equals()方法
        以后所有类中的equals方法也需要重写, 因为Object中的equals方法比较
        的是两个对象的内存地址, 而我们应该比较的是内容, 所以需要重写
        重写规则: 自己定, 主要看什么和什么相等时返回true
        基本数据类型比较用"=="
        对象和对象间用equals
        String类是SUN公司写的, 所以String类被重写了
        ***注意: equals()方法重写要彻底, 把所有相关的equals全部重写
 */
public class _00ObjectConception {
}
