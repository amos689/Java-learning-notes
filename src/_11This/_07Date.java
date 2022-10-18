package _11This;
/*
    this可以使用在哪里
        1.可以使用在实例方法中, 代表当前对象[this.]
        2.可以使用在构造方法中, 通过当前的构造方法调用其他方法[this(实参)](只能出现在构造函数第一行)
 */
public class _07Date {
    private int year;
    private int month;
    private int day;
    //构造方法
    public _07Date(int year,int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public _07Date() {
        /*
            this.year = 1970;
            this.month = 1;
            this.day = 1;
            不好, 代码重复率太高.
            可以通过调用上面的构造方法来完成
         */
        this(1970, 1, 1);
        //这种方法不会创建新的Java对象, 但是同时又能调用到其他的构造方法
        //但是注意: 这一行代码只能出现在第一行, 上面不能有任何代码, 下面无所谓
    }
    //setter and getter

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    //实例方法, 对外提供一个可以将实例发育输出到控制台
    public void print() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}
