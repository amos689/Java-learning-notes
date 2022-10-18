/*
    以下程序(计算两个int数据的和)不使用方法，会产生什么缺点
        繁琐，没有重复利用的价值
        应该在Java语言中有这样的机制
            某种功能代码只需要写一遍
            要使用这个功能，只需要给这个功能传递具体数据
            功能完成后返回最终结果
            这样就能提高代码复用性
            使用的过程称为调用：invoke
*/
/*
public class _04Method01 {
    public static void main(String[] args) {
        // 需求1：编写程序计算10和20的和
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //需求2：请编写程序计算666和888的和
        int x = 666;
        int y = 888;
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
        //......
    }
}
*/
//-------------------------------------------------------------
/*
    以下直接使用方法这种机制
    代码得到了重复使用
    方法的本质就是一段独立的代码片段并且这个代码片段能完成某个特定功能
    而且能反复使用
    这就是方法：method，在C语言中叫函数：function
*/
/*
    方法定义在类体当中，一个类当中可以定义多个方法
    没有先后顺序
    方法体当中不能再定义方法
    方法体中的代码是有顺序的从上往下执行
*/
public class _04Method01 {
    public static void main(String[] args) {
        sumInt(111, 222);
    }

    //单独定义一个方法
    //接收并计算两个int类型变量并计算出和
    public static void sumInt(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
