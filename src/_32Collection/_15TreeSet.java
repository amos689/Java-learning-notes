package _32Collection;

import org.junit.Test;
import java.util.*;

/*
    TreeSet集合存储元素特点:
    - 无序不可重复, 但是存储的元素可以自动按照大小排序, 称为可排序集合
    - 无序是指存入和取出的顺序不同
 */
public class _15TreeSet {
    @Test
    public void test1() {
        // 创建集合
        Set<String> s = new TreeSet<>();

        // 添加元素
        s.add("abc");
        s.add("def");
        s.add("amos");
        s.add("xyz");
        s.add("abc");
        s.add("opq");

        // 遍历
        /*
            abc
            amos
            def
            opq
            xyz
         */
        for (String str : s) {
            System.out.println(str);
        }
    }
}
