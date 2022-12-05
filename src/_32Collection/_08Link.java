package _32Collection;

/*
    链表类
    链表优点: 随机增删元素的效率较高(增删元素不涉及大量元素位移)
    链表缺点: 查询效率较低, 每一次查找某个元素的时候都要从头结点开始往下遍历
 */
// 链表数据结构
public class _08Link {
    // 头结点
    _09Node header = null;

    private int size = 0;

    public int size() {
        return size;
    }

    // 向链表中向末尾添加元素的方法
    public void add(Object data) {
        // 创建一个新的节点对象
        // 让之前单链表的末尾节点next指向新的节点对象
        // 这个元素是第几个是不确定的
        if (header == null) {
            // 说明还没有节点
            // new一个新节点对象, 作为头结点对象
            // 这个时候的头结点, 既是头结点, 又是尾节点
            header = new _09Node(data, null);
        }else {
            // 头不是空, 头节点已经存在
            // 找出当前末尾节点, 让当前末尾节点的next是新节点
            _09Node currentLastNode = findLast(header);
            currentLastNode.next = new _09Node(data, null);
        }
        size++;
    }

    // 查找尾节点的方法
    private _09Node findLast(_09Node node) {
        if(node.next == null) {
            //如果一个节点的next是null, 就说明这个节点就是尾节点
            return node;
        }
        // 程序能执行到这里, 说明node不是尾节点, 继续递归查找
        return findLast(node.next); //递归
    }
    // 删除链表中某个数据的方法
    public void remove(Object obj) {

    }

    // 修改链表中某个元素的方法
    public void modify(Object obj) {

    }

    // 查询某个元素下标
    public int find(Object obj) {
        return 1;
    }
}
