package _22ObjectClass;

/*
    关于Object类中的equals方法
        1.equals方法的源代码
            public boolean equals(Object obj) {
                return (this == obj);
            }
            以上这个方法是Object类的默认实现
                在Object类中equals方法当中, 默认采用"=="判断两个Java对象是否相等
                而"=="判断的是两个Java对象的内存地址, 我们应该判断两个Java对象内容
                上是否相等, 所以老祖宗的equals方法不够用, 需要被重写
        2.SUN公司设计equals方法的目的是什么
          以后变成的过程中, 都要通过equals方法来判断两个对象是否相等
        3.我们需要研究一下Object类给的这个默认的equals方法够不够用
        4.判断两个Java对象是否相等, 不能使用"==", 因为"=="比较的是两个对象的内存地址

 */
public class _02Equals {
    public static void main(String[] args) {
        //判断两个基本数据类型的数据是否相等, 直接使用"=="就行
        int a = 100;
        int b = 100;
        System.out.println(a == b); //true
        //判断两个Java对象是否相等
        //创建一个日期对象是2008年8月8日
        MyTime1 t1 = new MyTime1(2008, 8, 8);
        //创建一个新的日期对象, 但是表示的日期也是2008年8月8日
        MyTime1 t2 = new MyTime1(2008, 8, 8);
        //测试一下比较两个对象是否相等能不能使用"=="
        System.out.println(t1 == t2); //false, 显然不能, 因为比较的是两个地址是否相等
        //"=="是比较的两个变量里面保存的"东西"是否相等

        //重写equals方法之前
        //System.out.println(t1.equals(t2)); //依然比较地址, false

        //重写equals方法之后
        MyTime1 t3 = new MyTime1();
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

    }
}

class MyTime1 {
    int year;
    int month;
    int day;

    public MyTime1() {

    }

    public MyTime1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*
        重写Object中equals方法
     */
    public boolean equals(Object obj) {
        //当年月日都相同时, 表示两个日期相同, 两个对象相等
        //获取第一个日期的年月日, 获取第二个日期的年月日, 比较
        //obj属于Object类, 不能简单使用obj.year等来进行调用, 需要向下转型
        if(obj instanceof MyTime1) {
            MyTime1 t = (MyTime1)obj;
            if(this.year == t.year && this.month == t.month && this.day == t.day) {
                return true;
            }
        }
        //如果程序能执行到此处, 表示日期不相等/obj就不是MyTime类型, 直接return false
        return false;
    }
}