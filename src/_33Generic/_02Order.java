package _33Generic;

// 自定义泛型类
public class _02Order<T> {
    String orderName;
    int orderID;

    // 类的内部结构就可以使用类的泛型
    T orderT;

    public _02Order() {

    }

    public _02Order(String orderName, int orderID, T orderT) {
        this.orderName = orderName;
        this.orderID = orderID;
        this.orderT = orderT;
    }

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
}
