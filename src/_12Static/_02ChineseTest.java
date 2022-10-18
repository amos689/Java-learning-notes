package _12Static;

public class _02ChineseTest {
    public static void main(String[] args) {
        //创建中国人对象1
        _01Chinese zhangsan = new _01Chinese("111", "张三");
        System.out.println(zhangsan.id + ", " + zhangsan.name + ", " + _01Chinese.country);
        //创建中国人对象2
        _01Chinese lisi = new _01Chinese("222", "李四");
        System.out.println(lisi.id + ", " + lisi.name + ", " + _01Chinese.country); //注意此处的country用类名(虽然用引用.也行)
    }
}
