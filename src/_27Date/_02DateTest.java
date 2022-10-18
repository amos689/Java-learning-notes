package _27Date;

/*
    获取1970/01/01 00:00:00 000到现在系统时间的毫秒数
    1秒 == 1000毫秒

    总结一下System类的相关属性和方法
        System.out [out是System类的静态变量]
        System.out.println() [println()方法不是System类的, 是PrintStream类的方法]
        System.gc 启动垃圾回收器
        System.currentTimeMillis() 获取自1970年1月1日到系统当前时间的总毫秒数
        System.exit(0) 退出JVM

 */
public class _02DateTest {
    public static void main(String[] args) {
        long ntm = System.currentTimeMillis(); //1666073456496
        System.out.println(ntm);

        /*
            统计一个方法耗费的时长:
                在调用方法之前记录一个毫秒数
                执行完目标法之后再记录一个毫秒数
                相减
         */
        long start = System.currentTimeMillis();
        printI();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    //需求: 统计一个方法执行所耗费的时长
    public static void printI() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
}
