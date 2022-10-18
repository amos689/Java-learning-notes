package _15Polymorphism;

//鸟类
public class _03Bird extends _01Animal{
    //重写从父类中继承的方法

    public void move() {
        System.out.println("鸟儿在飞翔");
    }
    public void fly() {
        System.out.println("flying");
    }
}
