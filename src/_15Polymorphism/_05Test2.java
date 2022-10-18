package _15Polymorphism;

public class _05Test2 {
    public static void main(String[] args) {
        //父类型引用指向子类型对象
        //向上转型
        _01Animal a1 = new _02Cat();
        _01Animal a2 = new _03Bird();

        //向下转型[只有当访问此类对象中特有方法才转]
        if(a1 instanceof _02Cat) {
            _02Cat c1 = (_02Cat)a1;
            c1.catchMouse();
        }
        if(a2 instanceof _03Bird) {
            _03Bird b1 = (_03Bird) a2;
            b1.fly();
        }
    }
}
