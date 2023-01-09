package _32Collection;

import org.junit.Test;
import java.util.*;

/*
    HashSet
        - 遍历结果: hello1 hello4 hello5 hello2 hello3
        - 存储时顺序和取出是的顺序不同
        - 不可重复
        - HashSet的底层是HashMap
          放到HashSet集合中的元素实际上是啊放到HashMap集合的key部分了
 */
public class _14HashSet {
    @Test
    public void test() {
        Set<String> s = new HashSet<>();

        s.add("hello3");
        s.add("hello4");
        s.add("hello5");
        s.add("hello1");
        s.add("hello2");
        s.add("hello3");

        for(String str : s) {
            System.out.println(str);
        }
    }
}
