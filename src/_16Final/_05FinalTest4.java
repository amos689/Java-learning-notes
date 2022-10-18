package _16Final;

public class _05FinalTest4 {
    public static void main(String[] args) {
        System.out.println(Chinese.GUO_JI);
    }
}

class Chinese {
    /*
        国籍
        需求: 每个中国人的国籍都是中国, 且不会发生改变, 防止国籍被修改, 加final修饰
        final修饰的实例变量是不可变的, 这种变量一般和static连用, 称为"常量"
        常量的定义形式: public static final 类型 常量名 = 值;
        Java要求所有常量名必须全部大写, 中间用下划线连接
     */
    public static final String GUO_JI = "中国";
}
