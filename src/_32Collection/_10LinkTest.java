package _32Collection;

public class _10LinkTest {
    public static void main(String[] args) {
        // 相当于创建了集合对象
        _08Link link = new _08Link();
        link.add(100);
        link.add(200);
        link.add(300);

        // 获取元素个数
        System.out.println(link.size());
    }
}
