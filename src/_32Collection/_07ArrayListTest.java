package _32Collection;

import java.util.*;

/*
    集合ArrayList的构造方法
 */
public class _07ArrayListTest {
    public static void main(String[] args) {
        // 默认初始化容量10
        List myList1 = new ArrayList();

        // 指定初始化容量100
        List myList2 = new ArrayList(100);

        // 创建HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        // 通过这个方法将HashSet集合转换成List集合
        List myList3 = new ArrayList(c);
        for(int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(i));
        }
    }
}
