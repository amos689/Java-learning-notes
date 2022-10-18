package _22ObjectClass;

/*
    关于Object中toString()方法
        1.源码: 默认实现方式是: 类名@对象的内存地址转换为十六进制的形式
        public String toString() {
            return getClass().getName() + '@' + Integer.toHexString(hashCode());
        }
        2.toString()方法的作用是什么
            toString()方法设计的目的是: 通过调用这个方法可以将一个"Java对象"转换成"字符串表示形式"
        3.SUN公司开发Java语言的时候, 建议所有子类都去重写toString()方法, 这个方法
          应该是简洁的, 详实的, 易阅读的
 */
public class _01Test {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(1970, 1, 1);
        //日期对象转换成字符串形式的话, 我们希望看到一个具体的日期信息
        String s1 = mt1.toString();
        //MyTime重写toString()之前
        //System.out.println(s1);//返回一个MyTime@XXXXXX地址
        //重写toString()方法之后, 变成1970年1月1日
        System.out.println(s1);
        //* 注意: 输出引用的时候, 会自动调用该引用的toString()方法
        System.out.println(mt1);
    }
}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {

    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /*
        重写toString()方法
        这个toString()越简洁越好, 可读性越强越好
        向简洁的, 详实的, 易阅读的方向发展
     */
    public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}