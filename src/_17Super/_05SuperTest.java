package _17Super;

/*
    1."this."和"super."在大部分情况下都是可以省略的
    2.this.不能省略:
        public void setName(String name) {
            this.name = name;
        }
    3.super.不能省略:
        父类型和子类型中有同名属性, 并且希望在子类对象内访问父类的特征
 */
public class _05SuperTest {
    public static void main(String[] args) {
        Vip1 v = new Vip1("张三");
        v.shopping();
    }
}

class Customer1{
    String name;
    public Customer1() {

    }
    public Customer1(String name) {
        this.name = name;
    }
}

class Vip1 extends Customer1 {

    //假设子类也有一个叫name的同名属性
    //Java中允许在子类中出现和父类一样的同名变量/同名属性
    String name;

    public Vip1() {

    }
    public Vip1(String name) {
        super(name);
        /*
            这里会有一个省略的this.name = null;
            所以this.name就会变成null
            super.name会被赋值为张三
         */
    }
    public void shopping() {
        //this表示当前对象
        System.out.println(this.name + " is shopping!");
        System.out.println(name + " is shopping!");//可以省略this, 系统自动补
        //super表示当前对象的父类型特征(super是this指向那个对象中的一块空间)
        System.out.println(super.name + " is shopping!");
    }
}