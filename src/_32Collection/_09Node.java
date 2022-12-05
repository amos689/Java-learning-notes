package _32Collection;

/*
    单链表中的节点
        节点是单向链表中的基本单元
        每一个节点Node都有两个属性
        - 存储的数据
        - 下一个节点的内存地址
 */
public class _09Node {
    // 存储的数据
    Object data;

    // 下一个节点的内存地址
    _09Node next;

    public _09Node() {

    }

    public _09Node(Object data, _09Node next) {
        this.data = data;
        this.next = next;
    }
}
