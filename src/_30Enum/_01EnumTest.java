package _30Enum;

/*
    这个案例没有使用java中的枚举类型, 分析以下程序, 在设计方面有什么缺陷

 */
public class _01EnumTest {
    public static void main(String[] args) {
        System.out.println(divide(10, 0)); //0
        System.out.println(divide(10, 2)); //1
    }

    /**
     * 设计以下程序, 计算两个int类型数据的商, 计算成功返回1, 失败返回0
     * @param a int类型数据
     * @param b int类型数据
     * @return 计算成功返回1, 失败返回0
     */
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            //程序执行到此处表示以上代码没有发生异常, 表示执行成功
            return 1;
        } catch (Exception e) {
            //程序执行到此处表示以上程序出现了异常
            return 0;
        }
    }
}
