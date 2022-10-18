package _17Super;

/*
    在父和子中有同名的属性, 或者说有相同的方法,
    如果此时想在子类中访问父类型中的数据, 必须使用super.加以区分
    super的三种使用方法:
        super.属性名 [访问父类的属性]
        super.方法名(实参) [访问父类的方法]
        super(实参) [调用父类的构造方法]
 */
public class _06SuperTest {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.yiDong();
    }
}

class Animal{
    public void move() {
        System.out.println("Animal move!");
    }
}

class Cat extends Animal {
    //对move进行覆盖
    public void move() {
        System.out.println("Cat move!");
    }
    //单独编写一个子类特有方法
    public void yiDong() {
        this.move(); //Cat move!
        move(); //Cat move! 这里this能够省略
        super.move(); //Animal move!
    }
}