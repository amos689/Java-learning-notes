package _18AbstractClass;

/*
    抽象类
        1.抽象类中不一定有抽象方法, 抽象方法必须出现在抽象类中
        2.重要结论: 一个非抽象类继承抽象类, 必须将抽象类中的抽象方法实现(这是规定)

 */
public class _02AbstractTest {
    public static void main(String[] args) {
        //向上转型(自动类型转换)
        Animal a = new Bird(); //可以使用多态, 父类型引用指向子类型对象, 这就是面向抽象编程
        // a的类型是Animal, Animal是抽象的, 面向抽象编程, 不要面向具体编程, 降低程序耦合度, 提高程序扩展力
        a.move();
    }
}

//抽象动物类
abstract class Animal{
    //抽象方法
    public abstract void move();
}

//非抽象子类
//抽象类中有抽象方法时不能直接继承, 因为抽象方法必须出现在抽象类中
//需要将从父类方法继承过来的抽象方法进行覆盖/重写, 或者也可以叫做"实现"

class Bird extends Animal {
    public void move() {
        //必须进行覆盖, 这里的覆盖/重写也可以称为对抽象的实现
        //当然, 如果Bird是抽象类, 则不必进行覆盖/重写/实现
        System.out.println("Bird is flying!");
    }
}

