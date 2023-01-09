package _34Generic;

import java.util.*;

/*
    泛型的使用
    - jdk1.5新特性
    - 在集合中使用泛型
      - 集合接口或集合类在jdk1.5时都修改为泛型结构
      - 在实例化集合类时, 可以指明具体的泛型类型
      - 指明完之后, 再集合类或者接口中凡是定义类或接口时, 内部结构(属性, 方法, 构造器等)使用到的类的泛型的位置, 都指定为实例化的泛型的类型
        比如: add(E e) ----> 实例化对象之后: add(Integer e)
      - 注意: 泛型的类型必须是一个类, 不能是基本数据类型, 用到基本数据类型的位置请使用相应的wrapper class
      - 如果实例化时没有指明泛型的类型, 默认类型为Object类型
    - 如何自定义泛型结构: 泛型类/泛型接口/泛型方法: 见_03OrderTest
 */
public class _01GenericTest {
    // 在集合中引入泛型之前的情况
    public void test1() {
        ArrayList list = new ArrayList();

        // 需求: 存放学生的成绩(int)
        list.add(95);
        list.add(88);
        list.add(92);
        list.add(89);
        // 问题一: 类型不安全: 会混入非int类, 但是在运行中不会出问题, 使得运行不安全
        // list.add("amos");

        // 遍历输出
        for(Object score : list) {
            int stuScore = (Integer) score;
            // 问题二: 强转时, 可能出现ClassCastException
            System.out.println(stuScore); //第五个变量出现ClassCastException
        }
    }

    // 在集合中使用泛型的情况
    public void test2() {
        // 泛型是一个类型, 不能是基本数据类型, 所以必须是Integer不能是int
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 添加元素
        list.add(95);
        list.add(88);
        list.add(92);
        list.add(89);
        // 编译时会自动进行类型检查, 保证数据安全
        // list.add("amos");
        // 编译报错: add(java.lang.Integer) in ArrayList cannot be applied to (java.lang.String)

        // 遍历: 方式一
        for(Integer score : list) { //这里可以直接Integer, 因为泛型已经限制了类型
            // 避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }

        // 遍历: 方式二
        // Iterator源码带有泛型, list创建时指明是Integer型, 那么其对应的iterator返回的自然也是Integer类型
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            int stuScore = it.next();
            System.out.println(stuScore);
        }
    }

    // 在集合中使用泛型的情况(以HashMap举例)
    public void test3() {
        // 源码中: public interface Map<K, V>有两个泛型变量
        // Map<String, Integer> map = new HashMap<String, Integer>();
        // jdk1.7新特性: new的HashMap中<>可以不写, 是泛型的类型推断
        Map<String, Integer> map = new HashMap<>();

        // 添加变量
        map.put("amos", 100);
        map.put("tom", 90);
        map.put("amy", 92);
        map.put("jack", 96);
        // map.put(123, "ak"); 不符合自定义泛型的定义, 编译报错

        // 泛型的嵌套
        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        // 遍历
        Iterator<Map.Entry<String, Integer>> it = entry.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "----->" + value);
        }
    }

    public static void main(String[] args) {
        _01GenericTest genericTest = new _01GenericTest();
        genericTest.test1();
        genericTest.test2();
        genericTest.test3();
    }
}
