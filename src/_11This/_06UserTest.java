package _11This;

public class _06UserTest {
    public static void main(String[] args) {
        //创建对象并赋初值
        _05User u1 = new _05User(100, "ZhangSan");
        System.out.println(u1.getId() + "的名字是" + u1.getName());

        //修改名字和id
        u1.setName("LiSi");
        u1.setId(200);
        System.out.println(u1.getId() + "的名字是" + u1.getName());
    }
}
