package _19Interface;

/*
    继承和实现都存在的话, 代码应该怎么写
 */
public class _04InterfaceTest {
    public static void main(String[] args) {
        //创建对象(表面上看Animal没起作用)
        Flyable f = new Cat(); //多态
        f.fly();
    }
}

//动物父类
class Animal {

}

//可飞翔的接口, 像内存条插在主板上, 他们之间有接口, 内存条可以更换
interface Flyable {
    void fly();
}

//动物子类: 猫类. 通过翅膀这个接口, 让猫能飞
class Cat extends Animal implements Flyable {
    public void fly() {
        System.out.println("飞猫起飞, 翱翔太空.");
    }
}

// 蛇类, 如果你不想让他飞, 就可以不实现Flyable接口
class Snake extends Animal {

}