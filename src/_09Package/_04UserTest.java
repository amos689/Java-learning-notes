package _09Package;

public class _04UserTest {
    public static void main(String[] args) {
        _03User user = new _03User();
        //System.out.println(user.age);
        //user.age编译报错，在外部程序中无法直接访问
        //age非常安全，但是太安全了，彻底访问不到了QAQ
        user.setAge(-100);
        System.out.println(user.getAge());
        user.setAge(19);
        System.out.println(user.getAge());
    }
}
