package _34Generic;

import org.junit.Test;
import java.util.*;

/*
    - 泛型在继承方面的体现
      - 类A是类B的父类, G<A>和G<B>二者不具备子父类关系, 不能完成赋值
      - 类A是类B的父类/接口, A<G>和B<G>
    - 通配符的使用
      - E - Element (在集合中使用，因为集合中存放的是元素)
        T - Type（Java 类）
        K - Key（键）
        V - Value（值）
        N - Number（数值类型）
        ? - 表示不确定的java类型: G<A>和G<B>二者共同的父类是G<?>
      - 有限制(上下界)的通配符
        - 通配符指定上限
          extends: 使用时指定的类型必须是继承某个类, 或者实现某个接口(<=)
        - 通配符指定下限
          super: 使用时指定的类不能小于操作的类(>=)
        - 例:
          <? extends Number>: 只允许泛型为Number及Number的子类的引用调用
          <? super Number>: 只允许Number及Number的父类引用调用
          <? extends Comparable>: 只允许泛型为实现Comparable接口的引用调用
 */
public class _09GenericTest {
    // 泛型在继承方面的体现1
    @Test
    public void test1() {
        Object[] objs = null;
        String[] strs = null;
        objs = strs; //不报错, 因为二者存在继承关系

        List<Object> list1 = null;
        List<String> list2 = null;
        // list1 = list2; //报错, 因为两个list不存在继承关系, 是平级关系

        /*
            如果能如此赋值, 那么list1.add()由于list1是一个Object类型
            那么Object类型的List完全可以在add()的时候添加非String类型
            的变量, 如: list1.add(111);
         */
    }

    // 泛型在继承方面的体现2
    @Test
    public void test2() {
        List<String> list1 = null;
        ArrayList<String> list2 = null;
        list1 = list2; //不报错
        // 等同于
        List<String> list4 = new ArrayList<>();
    }

    // 通配符的使用
    @Test
    public void test3() {
        List<Object> list1 = null;
        List<String> list2 = null;

        // ?作为通用父类
        //  List<?>在逻辑上是 List<String>, List<Integer>等所有List<具体类型实参>的父类
        List<?> list = null;

        // 均不报错
        list = list1;
        list = list2;

        //
        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        list = list3;

        // 添加: 基本不允许添加
        // list.add("D"); //报错, 对于List<?>就不能向其中添加数据, 除了添加null
        list.add(null);

        // 获取: 允许读取
        Object o = list.get(0);
        System.out.println(o);
    }

    // 有限制条件的通配符的使用

    @Test
    public void test4() {
        List<? extends _10Person> list1 = null;
        List<? super _10Person> list2 = null;

        List<_11Student> list3 = null;
        List<_10Person> list4 = null;
        List<Object> list5 = null;

        // list1情况:
        list1 = list3;
        list1 = list4;
        // list1 = list5; //报错

        // list2情况:
        // list2 = list3; //报错
        list2 = list4;
        list2 = list5;
    }
}
