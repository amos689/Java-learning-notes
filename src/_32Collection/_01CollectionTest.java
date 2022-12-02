package _32Collection;

/*
    1.集合概述
        - 数组其实就是一个集合, 集合实际上就是一个容器, 可以用来容纳其他类型的数据
        - 集合是一个容器和载体, 可以一次容纳多个对象. 假设数据库中有10条记录,
          假设要把这10条记录查询出来, 在Java程序中会将这10条记录封装成10个Java对象
          然后将这10个Java对象放到某个集合中, 将这个集合传到前端, 然后遍历集合,
          将这些数据一个一个展现出来
        - 集合不能直接存储基本数据类型, 也不能直接存储Java对象,
          集合当中存储的值Java对象的内存地址(引用)
          list.add(100) //这里100自动装箱成Integer类型
        - 在Java中每一个不同的集合, 底层会对应不同的数据结构, 向不同的集合中存储数据,
          等于将数据放到了不同的数据结构中. 不同数据结构, 数据存储方式不同
          new ArrayList(); 创建底层是数组的集合
          new LinkedList(); 创建底层是链表的集合
          new TreeSet(); 创建底层是二叉树的集合对象
        - 集合在java.util.*包下
        - 牢记集合的继承结构图
        - Java中集合分为两大类
          一类是单个方式存储元素, 这一类集合中超级父接口: java.util.Collection
          一类是以键值对的方式存储元素, 这一类集合中超级父接口: java.util.Map
        - 总结(所有的实现类)
          ArrayList: 底层是数组
          LinkedList: 底层是双向链表
          Vector: 底层是数组, 线程安全的, 效率低, 使用较少
          HashSet: 底层是HashMap, 放到HashSet集合中的元素等同于放到HashMap集合中的Key部分
          TreeSet: 底层是TreeMap, 放到TreeSet集合中的元素等同于放到TreeMap集合中的Key部分
          HashMap和Hashtable: 底层都是哈希表, 但是Hashtable线程安全, 但是效率较低, 用的较少
          Properties: 线程安全的, 并且key和value只能存储字符串String
          TreeMap: 底层是二叉树, TreeMap集合的Key可以自动按照大小顺序排序

          List集合存储元素的特点: 有序(存进去的顺序和取出的相同, 每个元素都有下标)可重复(可以有重复的值)
          Set集合存储元素的特点: 无序(存进去的顺序和取出的顺序不一定相同, 每个元素没有下标)不可重复(没有重复的元素)
          SortedSet集合存储元素的特点: 无序不可重复, 但是元素是可以排序的(可以按照大小顺序排列)

          Map集合的key, 就是一个Set集合, 往Set集合中放数据, 实际上放到了Map集合的key部分
 */

import java.util.ArrayList;
import java.util.Collection;

/*
    java.util.Collection接口中常用的方法
        1. Collection中能存放什么元素
          没有使用泛型之前, Collection能存放所有Object的所有子类型(集合中不能存储基本数据类型, 也不能存储Java对象, 只是存储Java对象的内存地址)
          使用了泛型之后, Collection中只能存储某个具体的类型
        2. Collection中的常用方法
          - boolean add(Object e) 向集合中添加元素
          - int size() 获取集合中元素的个数
          - void clear() 清空集合
          - boolean contains(Object o) 判断当前集合中是否包含o, 包含true, 不包含false
          - boolean remove(Object o) 删除集合中的某个元素
          - boolean isEmpty() 判断集合是否为空, 空true, 非空false
          - Object[] toArray() 将集合转换成数组
 */
public class _01CollectionTest {
    public static void main(String[] args) {
        // 创建一个集合对象
        // Collection c = new Collection(); 接口是抽象的, 无法实例化
        Collection c = new ArrayList(); //多态
        // 测试Collection接口中的常用方法
        c.add(1200); //自动装箱, 实际上是放进去了个Integer对象的内存地址
        c.add(3.14); //自动装箱
        c.add(new Object());
        c.add(true);

        // 输出元素个数
        System.out.println("集合中元素的个数是: " + c.size()); //4

        //清空集合
        c.clear();
        System.out.println("集合中元素的个数是: " + c.size()); //0

        // 再向集合中添加元素
        c.add("hello"); //存入了String对象的内存地址
        c.add("world");
        c.add("绿巨人");
        c.add(2);

        // 判断集合中是否包含绿巨人
        boolean flag = c.contains("绿巨人");
        System.out.println(flag); //true
        boolean flag2 = c.contains("绿巨人2");
        System.out.println(flag2); //false
        System.out.println(c.contains(1)); //false

        // 删除集合中某个元素
        System.out.println("集合元素个数是: " + c.size()); //4
        c.remove(2);
        System.out.println("集合元素个数是: " + c.size()); //3

        // 判断集合是否为空
        System.out.println(c.isEmpty()); //false
        c.clear();
        System.out.println(c.isEmpty()); //true

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("hello world");

        // 转换成数组
        Object[] objs = c.toArray();
        for(int i = 0; i < objs.length; i++) {
            //遍历数组
            Object o = objs[i];
            System.out.println(o); //默认调用toString()方法
        }
    }
}
