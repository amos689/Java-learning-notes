package _11This;
/*
    关于this关键字:
        1.this关键字: 意为这个
        2.this是一个引用,this是一个变量, 保存了内存地址指向了自身, this存储在JVM内存
          堆内存Java对象内部
        3.创建100个Java对象, 每个对象都有this, 也就是说有100个不同的this
        4.this可以出现在实例方法中, this指向当前正在执行这个动作的对象
 */
public class _01Customer {
    //姓名
    String name; //实例变量必须使用引用.的方式访问
    //构造方法
    public _01Customer() {

    }
    //不带有static关键字的方法
    //客户购物的行为, 每个人都是不一样的
    //所以购物这个行为属于对象级别的行为
    //由于每个对象在购物时结果不同, 所以购物这个动作必须有对象参与
    //* 没有static的方法被称为实例方法, 没有static的变量被称为实例变量
    //* 注意: 当一个行为/动作在执行过程中需要对象参与的, 那么这个方法一定要定义为"实例方法", 不要带static关键字
    public void shopping() { //有对象参与, 不能有static
        //输出正在购物的人的名字
        System.out.println(this.name + "在购物"); //直接用this指向自身, 谁访问就指向谁
        //由于name是一个实例变量, 所以这个name在访问的时候一定是访问当前对象里的name
        //所以多数情况下, this是可以省略的
        //也可以写成System.out.println(name + "在购物");
    }

    //带有static
    public static void doSome() { //doSome不是对象调用, 是类名去调用的,执行过程中没有当前对象
        //System.out.println(name); 报错, 带有static的方法是通过类名的方式访问的
        //或者说这个上下文当中没有当前对象, 自然也不存在this(this代表的是当前正在进行这个动作的对象)
        //name是一个实例变量, 代码的含义是访问当前对象的name, 没有当前对象, 自然不能访问当前的name

        //假如想访问name的话, 该怎么做
        //可以采用以下方案, 但是访问的绝对不是当前对象的name
        _01Customer c = new _01Customer();
        System.out.println(c.name); //这里只会输出null, 因为系统会新实例化一个_01Custumer对象, 这个对象中name没有被赋值
    }
}
