package _26WrapperClass;

/*
    1.java中为8中基本数据类型又对应准备了8种包装类型
      8种包装类属于引用数据类型, 父类是Object
    2.为什么还要再提供8种包装类: 传递一个数字对应的包装类进去, 把数字经过构造方法变成对象
    3.8种基本数据类型对应的包装类型名是什么
      基本数据类型                                包装类型
--------------------------------------------------------------------
        byte                              java.lang.Byte(父类Number)
        short                             java.lang.Short(父类Number)
        int                               java.lang.Integer(父类Number)
        long                              java.lang.Long(父类Number)
        float                             java.lang.Float(父类Number)
        double                            java.lang.Double(父类Number)
        boolean                           java.lang.Boolean(父类Object)
        char                              java.lang.Character(父类Object)
        重点以Integer进行讲解, 其他照葫芦画瓢
 */
public class _01Integer {
    //入口
    public static void main(String[] args) {
        //有没有这种需求: 调用doSome()时, 需要传递一个数字进去
        //但是数字是基本数据类型, 而doSome()方法的参数是Object, 无法接收基本数据类型
        //可以传递一个数字对应的包装类进去, 把数字经过构造方法变成对象

    }
    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
