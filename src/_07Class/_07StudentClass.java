package _07Class;

/*
    学生类是一个模板，描述所有学生的共同特征【状态+行为】
    当前类只描述学生的状态信息【属性】
    所有学生都有学号信息，但是每个学生的学号都是不同的，所以要访问这个学号必须先创建对象
    通过对象来访问学号信息，学号不能直接通过类去访问，所以这种成员变量又被称为实例变量
    对象又被称为实例，实例变量又被称为对象变量【对象级别的变量】
 */
public class _07StudentClass { //_07StudentClass属于类，是引用数据类型
    //类体 == 属性 + 方法
    //属性【存储采用变量的形式】
    //由于变量定义在类体当中，方法体之外，这种变量称为成员变量
    //成员变量在没有手动赋值的情况下，系统赋默认值：全体向0看
    /*
        byte,short,int,long ---> 0
        float,double ---> 0.0
        boolean ---> false
        char ---> \\u000
        引用数据类型 ---> null
     */
    //不创建对象，这个num的内存空间是不存在的，只有创建了对象，这个num对象才会创建
    int num;//学号
    String name;//姓名
    int age;//年龄
    boolean sex;//性别
    String addr;//住址
}