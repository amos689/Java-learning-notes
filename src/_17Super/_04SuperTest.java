package _17Super;

public class _04SuperTest {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
    }
}

class Customer{
    String name;
    public Customer() {

    }
    public Customer(String name) {
        this.name = name;
    }
}

class Vip extends Customer {
    public Vip() {

    }
    public Vip(String name) {
        super(name);
    }
    public void shopping() {
        //this表示当前对象
        System.out.println(this.name + "is shopping!");
        System.out.println(name + "is shopping!");//可以省略this, 系统自动补
        //super表示当前对象的父类型特征(super是this指向那个对象中的一块空间)
        System.out.println(super.name + "is shopping!");
    }
}