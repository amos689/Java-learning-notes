package _32Collection;

import java.util.*;

/*
    ArrayList之所以比LinkedList检索效率高, 不是因为下标, 因为二者都有下标
    是因为底层数组发挥的作用, ArrayList底层是数组, 是连续的, LinkedList底层是
    双向链表, 是不连续的. 因为实际开发中大多数都是向末尾添加元素, 所以使用ArrayList的较多
    但是ArrayList非线程安全
    所以, 每个数据结构都有其长处和短板, 用在该用的地方
 */

/*
    LinkedList没有初始化容量一说
    最初这个链表中没有任何元素, first和last的引用都是null
    不管是LinkedList还是ArrayList, 以后写代码时不需要关心具体是哪个集合
    因为我们要面向接口编程, 调用的方法都是接口中的方法
 */
public class _11LinkedListTest {
    public static void main(String[] args) {
        // LinkedList与ArrayList用法上基本一样
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        for(int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
