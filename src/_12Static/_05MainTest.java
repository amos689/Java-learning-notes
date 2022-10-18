package _12Static;

public class _05MainTest {
    /*
        public表示公开的, 在任何位置都是可以访问的
        static表示是静态的, 使用类名.方法名即可访问, 不需要创建对象, 就可以调用main方法
        void表示main方法执行结束后不返回任何值
        main是main的方法名
        (String[] args)是main方法的形式参数列表
     */
    public static void main(String[] args) { //main方法也能重载
        main(10);
    }
    public static void main(int i) {
        System.out.println(i);
    }
}
