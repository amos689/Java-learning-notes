package _11This;

public class _02CustomerTest {
    public static void main(String[] args) {
        //创建_01Customer对象
        _01Customer c1 = new _01Customer();
        c1.name = "ZhangSan";
        c1.shopping();
        //再创建一个
        _01Customer c2 = new _01Customer();
        c2.name = "LiSi";
        c2.shopping();
    }
}
