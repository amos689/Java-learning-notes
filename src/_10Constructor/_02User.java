package _10Constructor;

public class _02User {
    public _02User() {
        System.out.println("User's Default Constructor Invoke!");
    }
    public _02User(int i) {
        i = ++i;
        System.out.println("带有int类型参数的构造器:i = " + i);
    }
    public _02User(String s) {
        System.out.println("带有String类型参数的构造器:String = " + s);
    }
}
