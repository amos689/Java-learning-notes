package _32Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    关于集合遍历/迭代专题
        注意:
        什么时候获取的迭代器, 该迭代器就是只在当前状态下集合的状态, 不会再动态改变, 相当于对当前集合的状态拍了一个快照
        集合结构一旦发生改变, 迭代器必须重新获取
        否则在调用next()时出现: java.util.ConcurrentModificationException异常
 */
public class _02CollectionTest {
    public static void main(String[] args) {
        // 注意: 以下讲解的遍历方式/迭代方式是所有Collection通用的一种方式
        // 在Map集合中不能使用, 在所有的Collection以及子类中使用

        // 创建集合对象
        Collection c = new HashSet(); //后面的集合无所谓, 主要看前面的Collection接口, 怎么遍历/迭代

        // 添加元素
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());

        // 对Collection集合进行遍历/迭代
        // 第一步: 获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator(); //Iterator是个接口, iterator是个方法, 调用方法传递了一个对象, 这个对象实现了Iterator接口, 是多态
        //第二步: 通过以上获取的迭代器对象开始迭代/遍历集合
        /*
            以下两个方法是迭代器对象Iterator中的方法
            - boolean hasNext() 如果仍然有元素可以迭代, 则返回true
            - Object next() 返回迭代的下一个元素
         */
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
