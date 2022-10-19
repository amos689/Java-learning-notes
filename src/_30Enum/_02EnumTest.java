package _30Enum;

/*
    采用枚举的方式改造程序
    总结:
        1.枚举是一种引用数据类型
        2.枚举怎么定义, 语法?
            enum 枚举类型名 {
                枚举值1, 枚举值2, ...
            }
        3.结果 == 2时, 建议使用boolean, 结果 > 2并且可以列举的, 建议使用enum类型
          颜色, 星期等都可以使用枚举类型
 */
public class _02EnumTest {
    public static void main(String[] args) {
        System.out.println(divide(10, 0) == Result.SUCCESS ? "成功" : "失败");

    }

    /**
     * 计算两个int数据的商看是否能完成
     * @param a int类型数据
     * @param b int类型数据
     * @return Result.SUCCESS表示成功, Result.FAIL表示失败
     */
    public static Result divide(int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        } catch(Exception e) {
            return Result.FAIL;
        }
    }
}

/*
    1.枚举: 一枚一枚能列举出来的, 才建议使用枚举类型
    2.枚举编译之后也是生成class文件
    3.枚举也是一种引用数据类型
    4.枚举中的每一个值可以看做是一个常量
 */

enum Result {
    //SUCCESS和FAIL是Result类型中的一个值
    //枚举类型中每一个值, 可以看做是一个"常量"
    SUCCESS, FAIL

}