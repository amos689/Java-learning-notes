package _33Generic;

import java.util.*;

// 自定义泛型类
public class _02Order<T> {
    String orderName;
    int orderID;

    // 类的内部结构就可以使用类的泛型
    T orderT;

    public _02Order() {
        // 创建T类型的数组
        // T[] arr = new T[10]; //编译不通过
        T[] arr = (T[]) new Object[10]; //这样是可以的
    }

    public _02Order(String orderName, int orderID, T orderT) {
        this.orderName = orderName;
        this.orderID = orderID;
        this.orderT = orderT;
    }

    // 不是泛型方法
    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "_02Order{" +
                "orderName='" + orderName + '\'' +
                ", orderID=" + orderID +
                ", orderT=" + orderT +
                '}';
    }

    // 泛型方法: 在方法中出现了泛型结构/泛型参数的方法, 与类的泛型参数没有任何关系
    // 换句话说, 泛型方法与其所属的类是不是泛型类无关
    // 定义泛型方法
    // 泛型方法可以是static的, 因为其不需要引入非静态变量
    public static <E> List<E> copyFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for(E e : arr) {
            list.add(e);
        }
        return list;
    }
}
