package _32Collection;

import java.util.*;

/*
    Vector:
    - 底层也是一个数组
    - 初始化容量为10
    - 每次双倍扩容
    - Vector中所有方法都是线程同步的, 都带有synchronize关键字
    - 效率太低, 用的很少
    - 使用java.util.Collections(集合工具类)将一个线程不安全的ArrayList转换成线程安全的
      java.util.Collection 是集合接口
      java.util.Collections 是集合工具类
 */
public class _12VectorTest {
    public static void main(String[] args) {
        // 创建Vector对象
        List v = new Vector();

        // 添加变量
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);

        // 第11个, 进行自动扩容
        v.add(11);

        // 遍历
        Iterator it = v.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        for(int i = 0; i < v.size(); i++) {
            Object obj = v.get(i);
            System.out.println(obj);
        }

        // ArrayList转换线程安全
        List list = new ArrayList();
        // 编程线程安全的
        Collections.synchronizedList(list);
        // 到这里list就已经是线程安全的了
        list.add(100);
        list.add(200);
    }
}
