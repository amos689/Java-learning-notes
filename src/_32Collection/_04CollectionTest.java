package _32Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    深入Collection集合的remove
    - boolean remove(Object o) 删除集合中的某个元素
    - remove方法是用来删除集合中某个元素的方法
      同样调用了equals方法进行比对, 比对成功就删除
    - 重点: 当使用remove让集合发生改变时, 迭代器必须重新获取, 如果还用老的迭代器, 会出现报错
      所以当迭代过程中, 不能调用集合对象的remove()方法
      应该使用迭代器来进行删除迭代器指向的元素: it.remove(xxx)
 */
public class _04CollectionTest {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建并添加字符串对象
        String s1 = new String("hello");
        c.add(s1);

        // 创建内容相同字符串对象并试图删除
        String s2 = new String("hello");
        c.remove(s2);

        // 查看结果
        System.out.println(c.size()); //0
    }
}

/*
    寄算机英语
        增: add, save, new
        删: delete, drop, remove
        改: update, set, modify
        查: find, get, query, select
 */