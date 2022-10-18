package _19Interface;

/*
    接口的基础语法:
        1.类和类之间叫做继承, 类和接口之间叫做实现(也可以看做是继承)
          继承使用extends完成, 实现使用implements完成
        2.当一个非抽象类实现接口的话, 必须将接口中所有的抽象方法进行覆盖/重写
 */
public class _02InterfaceTest {
    public static void main(String[] args) {
        //接口能使用多态吗: 可以
        //父类型的引用指向子类型的对象
        MyMath2 mm = new MyMathImp();

        //调用接口中的方法(面向接口编程)
        int result1 = mm.sum(20, 10);
        int result2 = mm.sub(20, 10);
        System.out.println(result1 + ", " + result2);
    }
}

//特殊的抽象类, 完全抽象的, 叫做接口
interface MyMath2{
    double PI = 3.14;
    int sum(int a, int b);
    int sub(int a, int b);
}

//编写一个类(非抽象的), 去实现接口MyMath2
class MyMathImp implements MyMath2 {
    //由于是非抽象类, 所以必须把所有抽象方法进行重写/覆盖
    /*
        抽象方法在覆盖的时候不能像在接口中一样进行省略:
        int sum(int a, int b) {
            return a + b;
        }
        这样写是错误的
     */
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}