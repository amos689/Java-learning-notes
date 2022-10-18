package _24Array;

/*
 * 一维数组的深入, 引用数据类型的一维数组
 * 对于数组来说, 实际上只能存储Java对象的内存地址, 数组中存储的每个元素是引用
 *
 */
public class _06ArrayTest {
    public static void main(String[] args) {
        //创建Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1, a2};

        //对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
            animals[i].move(); //这个move()方法不是数组的, 是数组中对象的move()方法

        }
        //动态初始化一个长度为2的Animal类型的数组
        Animal[] ans = new Animal[2];
        //创建一个Animal对象, 放到数组的第一个位置上
        ans[0] = new Animal();
        ans[0].move();
        //Animal[]只能存放Animal类型的对象和与其有继承关系的对象
        //创建一个Cat的对象, 发现可以使用多态, cat是一个animal
        ans[1] = new Cat();
        ans[1].move();
        //创建一个Animal类型的数数组, 里面存储Cat和Bird
        Animal[] anis = {new Cat(), new Bird()}; //存储了两个对象内存地址
        for (int i = 0; i < anis.length; i++) {
            anis[i].move();
            //anis[i]可能是Cat也可能是Bird, 不过肯定是个Animal
            //如果调用的是父类中的方法, 就不需要向下转型, 直接父类型引用调用即可
            //anis[i]需要向下转型才能调用特有方法(Animal中没有sing和catchMouse)
            if(anis[i] instanceof Cat) {
                Cat c = (Cat)anis[i];
                c.catchMouse();
            } else if(anis[i] instanceof Bird) {
                Bird b = (Bird)anis[i];
                b.sing();
            }
        }
        
    }
}

class Animal {
    public void move() {
        System.out.println("Animal move!");
    }
}

//猫类
class Cat extends Animal {
    public void move() {
        System.out.println("Cat move!");
    }
    //特有方法
    public void catchMouse() {
        System.out.println("Cat catch mouse!");
    }
}

//鸟类
class Bird extends Animal {
    public void move() {
        System.out.println("Bird fly!");
    }
    //特有方法
    public void sing() {
        System.out.println("Bird is singing!");
    }
}