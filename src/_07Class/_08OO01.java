package _07Class;

import _07Class._07StudentClass;

/*
    对象的创建和使用
 */
public class _08OO01 { //OO:ObjectOriented
    public static void main(String[] args) {
        /*
            通过一个类可以实例化N个对象
            实例化对象的方法：new 类名();
            new是Java语言中的一个运算符，在JVM堆内存中开辟新内存空间来创建对象
            方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间中
            栈内存：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
            堆内存：new的对象在堆内存中存储
         */
        //new _07Class._07StudentClass()是一个学生对象，s是一个变量名，也是个局部变量【栈中存储】
        _07StudentClass s = new _07StudentClass();
        /*
            new运算符创建的，在堆内存里开辟的空间叫做对象
            引用是一个变量，只不过这个变量中保存了另一个Java对象的内存地址
            对象的内存地址给了s，s叫引用
            如果访问堆内存，必须经过引用的部分，即Java没有指针的概念
            访问实例变量的语法格式：
                读取数据：引用.变量名
                修改数据：引用.变量名 = 值;
         */
        int stuNum = s.num;
        String stuName = s.name;
        boolean stuSex = s.sex;
        int stuAge = s.age;
        String stuAddr = s.addr;
        System.out.println("学号 = " + stuNum);
        System.out.println("姓名 = " + stuName);
        System.out.println("年龄 = " + stuAge);
        System.out.println("性别 = " + stuSex);
        System.out.println("住址 = " + stuAddr);
        s.num = 10;
        s.name = "jack";
        s.age = 20;
        s.sex = true;
        s.addr = "北京";
        System.out.println("学号 = " + s.num);
        System.out.println("姓名 = " + s.name);
        System.out.println("年龄 = " + s.age);
        System.out.println("性别 = " + s.sex);
        System.out.println("住址 = " + s.addr);
        /*
            不能通过System.out.println(_07Class._07StudentClass.num)来访问学号
            必须通过创建的对象才能访问实例变量，不能直接通过“类名”访问
         */
    }
}
