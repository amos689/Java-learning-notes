package _32Collection;

import java.util.*;

/*
    jdk1.5之后新特性: 增强for循环, 或者叫做foreach
    语法: for(元素类型 变量名 : 数组或集合) {}
    foreach有一个缺点: 没有下标, 在需要使用下标的循环中, 不建议使用增强循环
 */
public class _13ForEachTest {
    public static void main(String[] args) {
        // int类型数组
        int[] arr = {111, 222, 333, 444, 555, 666};

        // 遍历数组(普通)
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==============");

        // 遍历数组(增强)
        for(int data : arr) {
            System.out.println(data); //data就是数组中的元素
        }
        System.out.println("==============");

        // 创建集合
        List<String> strList = new ArrayList<>();

        // 添加元素
        strList.add("hello");
        strList.add("world");
        strList.add("amos");

        // 使用迭代器遍历
        Iterator<String> it = strList.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("==============");

        // 使用有下标的for循环
        for(int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            System.out.println(s);
        }
        System.out.println("==============");

        // 使用foreach
        for(String s : strList) {
            System.out.println(s);
        }
    }
}
