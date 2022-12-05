package _05MethodOverloading;

/*
    代码不使用方法重载机制，存在的缺点
        1.sumInt,sumDouble,sumLong方法虽然名称不同，但是功能是相似的，都是求和
          相同的功能起了不同的名字，对程序员来说调用的时候不方便
        2.代码冗长，不美观
    方法重载（Overload）：让程序员在使用这些方法就像在使用同一个方法一样
    体验方法重载的优点
*/
/*
    * 什么时候考虑方法重载：功能相似的时候尽可能让方法名相同（反之亦反）
    * 什么情况构成了方法重载：
        * 方法重载只和方法名和参数列表有关
        在同一个类当中
        方法名相同
        参数列表不同：
            1.参数数量不同
                public static void m1(){}
                public static void m1(int a){}
            2.顺序不同
                public static void m2(int a, double b){}
                public static void m2(double b, int a){}
            3.类型不同
                public static void m3(int a){}
                public static void m3(double a){}
        方法重载和返回值类型，修饰符列表无关！
*/
public class _05MethodOverloading {
    public static void main(String[] args) {
        //调用方法的时候就像在使用一个方法一样
        //参数类型不同，对应调用方法不同
        //不再依靠方法名，依靠参数类型区分
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2.0));
        System.out.println(sum(1L, 2L));
    }

    public static int sum(int a, int b) {
         return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
