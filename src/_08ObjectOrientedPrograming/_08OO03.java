package _08ObjectOrientedPrograming;

import _08ObjectOrientedPrograming._08OO02;

//与_08OO02,04搭配使用
//用户类
public class _08OO03 {
    //属性【以下都是成员变量中的实例变量】

    /*
        用户编号
        int是一个基本数据类型
        num是一个实例变量
     */
    int num;
    /*
        用户名
        String是一种引用数据类型：代表字符串
        name是一个实例变量
        name是一个引用：保存内存地址的一个变量，地址指向了堆内存中的对象
     */
    String name;
    /*
        家庭住址
        _08OO02是一种引用数据类型：代表家庭住址
        addr是一个实例变量
        addr是一个引用：保存内存地址的一个变量，地址指向了堆内存中的对象
     */
    _08OO02 addr;
}
