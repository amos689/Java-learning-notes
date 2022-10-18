package _24Array;

/*
    关于一维数组的扩容
    在Java中, 数组长度一旦确定不可变, 那么数组满了怎么办
         数组满了, 需要扩容
         java中对数组的扩容是:
            先新建一个大容量的数组, 然后将小容量数组一个一个拷贝到大数组当中
    结论: 数组克隆效率较低, 因为涉及到拷贝的问题.
         所以在以后的开发中尽可能少的进行数组的拷贝.
         可以在创建数组对象是预估一下多长合适, 这样可以减少数组扩容的次数
 */
public class _07ArrayTest {
    //Java中的数组是怎么进行拷贝的
    /*
        System.arraycopy(Object src, int srcPos, Object dest,
                         int destPos, int length);
        src:源数组;
        srcPos:源数组要复制的起始位置;
        dest:目的数组;
        destPos:目的数组放置的起始位置;
        length:复制的长度.
        * 这个拷贝是覆盖式的
        * 数组越界是会报错的
        * 除了基本数据类型是完全拷贝, 其他的拷贝的不是对象, 而是对象的地址
     */
    public static void main(String[] args) {
        //拷贝源
        int[] src = {1, 2, 3, 4};
        //拷贝目标
        int[] dest = new int[20]; //动态初始化长度为20的数组, 每个默认0
        //调用JDK System类中arraycopy方法, 完成数组的拷贝
        System.arraycopy(src, 2, dest, 1, 2);
        //遍历目标数组
        for(int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]); //0 3 4 0 0 ...
        }
        System.out.println("=======================");
        int[] dest2 = new int[10];
        System.arraycopy(src, 0, dest2, 0, src.length);
        for(int i = 0; i < dest2.length; i++) {
            System.out.println(dest2[i]);
        }
        //数组中如果存储的元素如果是引用, 也是可以的
        System.out.println("======================");
        String[] strs = {"hello", "world", "java", "oracle", "mysql", "jdbc"};
        String[] strs1 = new String[10];
        System.arraycopy(strs, 0, strs1, 0, strs.length);
        for(int i = 0; i < strs1.length; i++) {
            System.out.println(strs1[i]);
        }
        //除了基本数据类型外, 引用数据类型均只拷贝对象的地址, 而没有新建对象
        System.out.println("=============");
        int[] a = {1, 2, 3, 4};
        int[] b = new int[4];
        System.arraycopy(a, 0, b, 0, a.length);
        b[3] = 8;
        System.out.println(a[3] + " && " + b[3]);
        Object[] c = {new Object(), new Object(), new Object()};
        Object[] d = new Object[3];
        System.arraycopy(c, 0, d, 0, c.length);
        System.out.println(c[2] + " && " + d[2]);
    }
}
