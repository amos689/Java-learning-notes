package _32Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
    测试List接口中常用的方法
    - List集合存储元素特点: 有序可重复
      有序: List集合中的元素有下标(从0开始, 依次增1)
    - List是Collection的子接口, 那么肯定List接口在继承Collection类方法的同时有自己的"独特"方法
      以下只列出List接口特有的常用的方法
      - void add(int index, Object element) 在指定位置添加元素
      - Object get(int index) 返回给定下标的对象
      - int indexOf(Object o) 返回o第一次出现的下标
      - int lastIndexOf(Object o) 返回o最后一次出现的下标
      - Object remove(int index) 删除指定位置的元素并返回
      - Object set(int index, Object element) 修改指定位置的元素并返回
      - boolean retainAll(Collection<?> c) 求集合的交集
 */
public class _05ListTest {
    public static void main(String[] args) {
        // 创建List类型的集合
        List myList = new LinkedList();

        // 添加元素
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        //在下标为1的位置加入"AMOS", 剩下的往后移
        // 使用不多, 因为对于List集合效率较低
        myList.add(1, "AMOS");

        // 迭代
        Iterator it = myList.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

        // 根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj); //a

        // 因为有下标, 所以List集合可以用下标进行遍历
        for(int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        myList.add("AMOS");
        // 获取指定对象第一次和最后一次出现处的索引
        System.out.println(myList.indexOf("AMOS")); //1
        System.out.println(myList.lastIndexOf("AMOS")); //5

        // 修改指定位置的元素
        myList.set(2, "Liu");
        System.out.println(myList.get(2)); //Liu

        // 删除下标为4的元素
        myList.remove(4);
        // 遍历
        System.out.println("===============");
        for(int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
