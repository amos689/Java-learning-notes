package _32Collection;

import java.util.ArrayList;
import java.util.List;

/*
    关于ArrayList
    - ArrayList集合初始化容量是10, 如果超出, 默认增大1.5倍
    - ArrayList集合底层是Object类型的数组Object[]
    - 构造方法可以指定容量, 也可以不指定用默认容量
    - 数组优点: 检索效率比较高(每个元素占用空间大小相同, 内存地址连续)
    - 数组缺点: 随机增删元素效率较低, 但是向末尾添加元素效率很高, 不受影响
    - 集合中使用ArrayList比较多
 */
public class _06ArrayListTest {
    public static void main(String[] args) {
        // 默认初始化容量为10
        List list1 = new ArrayList();
        // 指定初始化容量20
        List list2 = new ArrayList(20);
        // 但是调用size()方法显示都是0, 可见, size方法是获取当前集合中元素个数的, 而不是获取集合的容量的
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
