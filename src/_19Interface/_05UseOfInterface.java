package _19Interface;

/*
    注意: 接口在开发中的作用类似于多态在开发中的作用
    多态: 面向抽象编程, 不要面向具体编程, 降低程序耦合度, 提高程序扩展力
    有了接口就有了可插拔能力, 扩展力很强, 不是焊接死的
    接口的解耦合, 解的是调用者和实现者之间的耦合
    大型项目开发, 一般都是将项目分解成一个个模块, 模块之间采用接口衔接, 降低耦合度
 */
public class _05UseOfInterface {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cook1 = new CNCook();
        FoodMenu cook2 = new USCooker();
        //创建顾客对象
        Customer cust = new Customer(cook1);
        //顾客点菜
        cust.order();
    }
}

//菜单: 抽象的接口
interface FoodMenu {
    void chaoDan();
    void rouSi();
}

//厨师实现菜单上的菜, 是接口的实现者

//中国厨师
class CNCook implements FoodMenu {
    public void chaoDan() {
        System.out.println("ChaoDan made by CNCooker.");
    }
    public void rouSi() {
        System.out.println("RouSi made by CNCooker.");
    }
}

//美国厨师
class USCooker implements FoodMenu {
    public void chaoDan() {
        System.out.println("ChaoDan made by USCooker.");
    }

    public void rouSi() {
        System.out.println("RouSi made by USCooker.");
    }
}

//顾客
class Customer {
    /*
        顾客手里**有一个(has a)**菜单
        记住: 以后凡是能用**有一个**来描述的, 统一以属性的方式存在
        A {
            B b;
        }
    */
    /*
        猫**是(is a)**一个动物
        记住: 以后凡是能用**是**;来描述的, 都可以用继承关系
        A extends B
     */
    /*
        厨师**像一个(like a)**菜单
        记住: 以后能用**像一个**来表示的, 都可以用实现关系(通常是类实现接口)
        A implements B
     */
    private FoodMenu foodMenu; //声明一个实例变量

    //构造方法
    public Customer() {

    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //set/get方法
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //点菜
    public void order() {
        //得先得到菜单
        //FoodMenu fm = this.getFoodMenu(); 其实在同一个类中, 可以直接this.FoodMenu
        foodMenu.chaoDan();
        foodMenu.rouSi();
    }
}