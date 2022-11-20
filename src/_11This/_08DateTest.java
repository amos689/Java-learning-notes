package _11This;

public class _08DateTest {
    public static void main(String[] args) {
        //创建日期对象1, 输出默认值1970年1月1日
        _07Date time1 = new _07Date();
        time1.print();

        //创建日期对象2
        _07Date time2 = new _07Date(2022, 8, 30);
        time2.print();
    }
}
