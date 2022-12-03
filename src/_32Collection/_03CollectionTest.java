package _32Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    深入Collection集合的contains
    - boolean contains(Object o) 判断当前集合中是否包含对象o
    - contains方法是用来判断集合中是否包含某个元素的方法
      调用了equals方法进行比对, 返回true包含, false不包含
      所以, 当自定义类时, 如果重写了equals方法, 那就会比较你指定的内容是否相等
    - 重写类的equals方法是个好习惯
 */
public class _03CollectionTest {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        String s1 = new String("abc"); //s1 = 0x1111
        c.add(s1);

        String s2 = new String("def"); //s2 = 0x2222
        c.add(s2);

        // 集合中元素的个数
        System.out.println("元素的个数是: " + c.size()); //2

        // 新建的对象String
        String x = new String("abc"); //x = 0x6666
        System.out.println(c.contains(x)); //true, 所以contains不是简单的比较内存地址, 而是调用了equals()方法

    }
}
