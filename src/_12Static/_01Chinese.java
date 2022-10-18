package _12Static;

/*
    什么时候成员变量声明为实例变量呢
        所有对象都有这个属性, 但是这个属性的值会随着对象的变化而变化
    什么时候成员变量声明为静态变量呢
        所有对象都有这个属性, 并且所有对象的这个属性都是一样的
    静态变量在加载的时候初始化, 内存在方法区中被开辟, 访问的时候不需要创建对象, 直接类名.静态变量名访问
 */
public class _01Chinese {
    //实例变量, 一个Java对象就有一份
    //身份证号[每一个对象的身份证不同]
    String id;

    //姓名[每个对象姓名不同]
    String name;

    //国籍[每个对象都是由chinese类实例化的, 所以每个中国人的国籍都是中国]
    //100个Java对象就有100个country, 有什么缺点
    //String country;
    //所有中国人的国籍都是中国, 这里声明为实例变量显然不合适, 占用内存空间
    //所有对象国籍一样, 这种特征属于类级别的特征, 可以提升为整个模板的特征加static修饰
    //静态变量存储在放方法区内存中
    static String country = "中国";

    //构造函数
    public _01Chinese() {

    }
    public _01Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
