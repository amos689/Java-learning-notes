package _15Polymorphism;

//猫类
public class _02Cat extends _01Animal{
    public void move() {
        System.out.println("猫在走猫步");
    }
    //不是从父类继承的方法, 是子类对象特有的行为
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
