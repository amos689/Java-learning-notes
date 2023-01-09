package _34Generic;

// _05SubOrder依然是一个泛型类
public class _05SubOrder<T> extends _02Order<T> { // 仿效ArrayList对于AbstractList

    public _05SubOrder() {
    }

    public _05SubOrder(String orderName, int orderID, T orderT) {
        super(orderName, orderID, orderT);
    }
}
