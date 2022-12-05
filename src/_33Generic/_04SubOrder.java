package _33Generic;

// _04SubOrder不是一个泛型类
public class _04SubOrder extends _02Order<Integer> {
    public _04SubOrder() {
    }

    public _04SubOrder(String orderName, int orderID, Integer orderT) {
        super(orderName, orderID, orderT);
    }
}
