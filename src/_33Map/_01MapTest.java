package _33Map;

/*
    java.util.Map接口
    - Map和Collection没有继承关系
    - Map集合以key和value的方式(键值对)存储数据
      - key和value都是引用数据类型
      - key和value都是存储的对象的内存地址
      - key起主导地位
    - 常用方法
      - void clear() 移除所有映射关系
      - boolean containsKey(Object key)
        boolean containsValue(Object value) 返回是否包含Key或者Value
      - V get(Object key) 返回key对应的value
      - boolean isEmpty() 判断集合是否为空
      - V put(K key, V value) 添加键值对
      - V remove(Object key) 删除键值对(当键存在的时候)
      - int size() 返回元素个数
      - Collection<V> values() 获取Map集合中所有的value, 返回一个Collection
      - Set<K> keySet() 获取Map集合中所有的key, 返回一个Set
      - Set<Map.Entry<K, V>> entrySet() 将Map集合转换为Set集合(合并了key和value)
 */
public class _01MapTest {
}
