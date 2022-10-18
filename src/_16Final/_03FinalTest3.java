package _16Final;

public class _03FinalTest3 {
    public static void main(String[] args) {
        //创建用户对象
        _04User u = new _04User(100);

        //又创建了个新的对象
        //执行到此处表示以上对象已经变成垃圾数据, 等待垃圾回收器的回收
        u = new _04User(200);

        //创建final修饰的用户对象
        final _04User u2 = new _04User(30);
        System.out.println(u2.getId());
        //此时u2 = new _04User(50);会报错, 赋null都不行, u2将无法被回收直到main结束
        u2.setId(50);
        System.out.println(u2.getId());
    }

}
